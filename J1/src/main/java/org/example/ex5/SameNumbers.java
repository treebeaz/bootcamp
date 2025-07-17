package org.example.ex5;

public class SameNumbers {
    public static int[] findIdenticalFirstAndLastNumber(int[] array, int size) {
        int[] temp = new int[size];
        int index = 0;
        for(var el : array) {
            if(isIdentical(el)) {
                temp[index++] = el;
            }
        }
        return temp;
    }

    private static boolean isIdentical(int element) {
        int last = element % 10;
        element /= 10;

        if(element == 0) {
            return true;
        }
        else {
            do {
                int first = element % 10;
                element /= 10;
                if (element == 0 && last == first) {
                    return true;
                }
            }
            while (element > 0);
        }

        return false;
    }
}
