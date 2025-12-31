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
        List<String> personName = Arrays.asList("Mister","Aryan","Vicky");

//       long result =  personName.stream().filter(x -> x.startsWith("A")).count();


        System.out.println(personName.stream().filter(x -> x.length() > 3).toList());

        //Example: Squaring and Sorting
        List<Integer> numbering = Arrays.asList(5,2,9,1,6);
        System.out.println(numbering.stream().map(x -> x *x).sorted().toList());

        // Example: Counting Occurance of a character

        String sentense = "Hello  world";

        System.out.println(sentense.chars().filter(x -> x == 'l').count());
    }
}
