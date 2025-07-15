package org.example.ex5;

public class SameNumbers {
    public static int[] findIdenticalFirstAndLastNumber(int[] array, int size) {
        int[] identical = new int[size];
        boolean flag = false;
        for (int i = 0; i < size;i++) {
            int tempElement = array[i];
            int lastDigit = array[i] % 10;
            int firstDigit = 0;
            // TODO
            do{
                int temp = array[i] % 10;
                array[i] /= 10;
                System.out.println(temp);
                if(array[i] == 0) {
                    firstDigit = temp;
                    break;
                }

            }while (array[i] > 0);

            if(firstDigit == lastDigit) {
                flag = true;
                identical[i] = tempElement;
                System.out.println(identical[i]);
            }
        }
        if(!flag) {
            System.out.println("There are no such elements");
            return null;
        }

        return identical;
    }
}
