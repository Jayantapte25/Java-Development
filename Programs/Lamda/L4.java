package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0) //The filter operation selects elements from the stream that match a given predicate (condition). In filter we check the condition and if it is true then we return the element.
               .forEach(System.out::println);

        System.out.println("\nMapped (Each number * 2):");
        numbers.stream()
               .map(n -> n * 2)
               //The map operation transforms each element of the stream into another value using a given function. In map we directlt assign the value to the element.
               .forEach(System.out::println);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum); 

                        //numbers.stream(): This converts the list numbers into a stream of elements.
                        //.reduce(0, Integer::sum): Here, 0 is the initial value (identity), which is the starting value for the reduction.
                        //Integer::sum is a binary operator that takes two integers and returns their sum.

        System.out.println("\nSum of all numbers: " + sum);

        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList()); //collect() method is used to collect the elements of the stream into a collection.

        System.out.println("\nList of Even Numbers:");
        System.out.println(evenNumbers);
    }
}
