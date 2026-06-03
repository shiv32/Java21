import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class PriceFeed {

    public List<Double> getPrices() {
        return List.of(
                100.0,
                101.0,
                102.0,
                99.0,
                98.0,
                103.0,
                105.0
        );
    }

}

class MovingAverageStrategy {

    private final int period;
    private final Queue<Double> window = new LinkedList<>();
    private double sum = 0;

    public MovingAverageStrategy(int period) {
        this.period = period;
    }

    public void onPrice(double price) {

        window.add(price);
        sum += price;

        if (window.size() > period) {
            sum -= window.remove();
        }

        double ma = sum / window.size();

        String signal;

        if (price > ma) {
            signal = "BUY";
        } else if (price < ma) {
            signal = "SELL";
        } else {
            signal = "HOLD";
        }

        System.out.printf(
                "Price: %.2f MA: %.2f Signal: %s%n",
                price,
                ma,
                signal);
    }

}

public class Main {

    public static void main(String[] args) {

        PriceFeed feed = new PriceFeed();
        MovingAverageStrategy strategy = new MovingAverageStrategy(3);

        for (double price : feed.getPrices()) {
            strategy.onPrice(price);
        }
    }
}
