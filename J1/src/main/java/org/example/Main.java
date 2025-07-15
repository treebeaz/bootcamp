package org.example;

import org.example.ex1.TrianglePerimeter;
import org.example.ex2.NegativeNumberException;
import org.example.ex2.Time;
import org.example.ex3.Fibonacci;
import org.example.ex4.ArithmeticMean;
import org.example.ex5.SameNumbers;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
        fifthTask();
    }

    public static void firstTask() {
        TrianglePerimeter triangle = new TrianglePerimeter();
        Scanner sc = new Scanner(System.in);
        int counterCoordinates = 0;
        while(counterCoordinates != 3) {
            try {
                double x = Double.parseDouble(sc.nextLine());
                double y = Double.parseDouble(sc.nextLine());
                triangle.executeProcessing(x,y);
                counterCoordinates++;
            }
            catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }

        sc.close();

        if(!triangle.isTriangle()) {
            System.out.println("It isn't triangle");
        }
        else {
            System.out.printf("Perimeter: %.3f ", triangle.calculate());
        }
    }

    public static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while(!isValid) {
            try {
                int inputTime = Integer.parseInt(scanner.nextLine());
                if (inputTime < 0) {
                    throw new NegativeNumberException("Incorrect time");
                }
                Time time = new Time(inputTime);
                time.calculate();
                isValid = true;
            }
            catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }

        scanner.close();
    }

    public static void thirdTask() {
        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(Fibonacci.findFibonacci(n));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while(!isValid) {
            try {
                int size = Integer.parseInt(scanner.nextLine());
                int[] array = new int[size];
                for(int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(scanner.next());
                }
                System.out.println(ArithmeticMean.negativeArithmeticMean(array, size));
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            } catch (NegativeArraySizeException e) {
                System.out.println("Input error. Size <= 0");
                break;
            }
        }

        scanner.close();
    }

    public static void fifthTask() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try{
                int size = Integer.parseInt(scanner.nextLine());
                int[] array = new int[size];
                for(int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(scanner.next());
                }
                if(SameNumbers.findIdenticalFirstAndLastNumber(array, size) != null) {
                    for (var element : Objects.requireNonNull(SameNumbers.findIdenticalFirstAndLastNumber(array, size))) {
                        System.out.print(element + " ");
                    }
                }
                isValid = true;
            }
            catch (NegativeArraySizeException e) {
                System.out.println("Input error. Size <= 0");
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
    }
}
