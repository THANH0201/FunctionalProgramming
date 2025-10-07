package task1;

import java.util.Arrays;

public class CalculateMean {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double mean = Arrays.stream(numbers)//stream sources
                .average()                  //terminal operation
                .orElse(0);           //return 0 if empty array
        System.out.println("Mean : " + mean);
    }
}