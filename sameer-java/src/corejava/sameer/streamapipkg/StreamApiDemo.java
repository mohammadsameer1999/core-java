package corejava.sameer.streamapipkg;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Hello sameer");
        System.out.println(numbers.stream().filter(x -> x % 2== 0).count());
        List<String> personName = Arrays.asList("Mister","Aryan","Vicky","Rohan");
       long result =  personName.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(result);
    }
}
