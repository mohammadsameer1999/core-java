package corejava.sameer.suppliers;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        this  is Comsumer code is here
//        Consumer<Integer> loggingObject = (Integer val ) -> {
//            if (val > 10) {
//                System.out.println("ten is prin t");
//            }
//        };
//        loggingObject.accept(11);
//    }

        Supplier<String> evenNumberIS = () -> "This data i'm return HERE";
        System.out.println(evenNumberIS.get());

        /**  this supplier code is Here -----> ***/

    }
}
