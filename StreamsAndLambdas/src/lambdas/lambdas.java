package lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Tahmidul Islam
 */
public class lambdas {
    public static void show(){
//       List<String> list = List.of("a","b","c");
//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpper = item-> System.out.println(item.toUpperCase());
//
//        list.forEach(printUpper.andThen(print));
        ////
//        Supplier<Double> getRandom = () ->  Math.random();
//        var random = getRandom.get();
//        System.out.println(random);

        List<Integer> list = List.of(1,2,3,4,5,6);
        list.stream()
                                    .filter(number -> number%2==0)
                                    .forEach(n-> System.out.println(n));


    }

    public static void greet(Printer printer) {
        printer.print("Hello WOrld");
    }

    public static void main(String[] args) {
//        show();
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
