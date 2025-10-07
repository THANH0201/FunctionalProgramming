package task2;

import java.util.Arrays;
import java.util.List;

public class FilteringTransformingListNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double sum = numbers.stream()//stream sources
                // intermediate operations
                .mapToInt(n -> n) // change numbers into  integer
//    Filter out all the even numbers from the list.
                .filter(n -> n % 2 != 0)
//    Double each remaining number.
                .map(n -> n * 2)
//    Find the sum of the resulting numbers.
                // terminal operation
                .sum();
        System.out.println("Sum: " + sum);
    }
}
