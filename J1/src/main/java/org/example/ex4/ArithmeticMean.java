package org.example.ex4;

public class ArithmeticMean {

    public static int negativeArithmeticMean(int[] array, int size) {
        int mean = 0;
        for(int i = 0, counter = 0; i < size; i++) {
            if(array[i] < 0) {
                mean += array[i];
                counter++;
            }
            if(i == size - 1 && counter != 0) {
                mean = mean / counter;
            }
        }
        if(mean == 0) {
            System.out.println("There are no negative elements");
        }
        return mean;
    }
}
