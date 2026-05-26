
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)   // VERY IMPORTANT

//create your own annotation
@interface MyAnnotation {

    String value();
}

@MyAnnotation("test")
class Demo {
}

public class Main {

    public static void main(String[] args) {

        Class<Demo> obj = Demo.class;

        if (obj.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = obj.getAnnotation(MyAnnotation.class);

            System.out.println(ann.value());  // prints "test"
        }

    }
}
