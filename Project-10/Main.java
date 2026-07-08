
class Complex {

    int real, imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Complex{");
        sb.append("real=").append(real);
        sb.append(", imag=").append(imag);
        sb.append('}');
        return sb.toString();
    }

}

public class Main {

    public static void main(String[] args) {

        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex c = a.add(b);   // No '+' operator

        System.out.println(c);

    }
}
