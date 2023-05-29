
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

import java.util.*;


public class task2 {
    public static void main(String[] args) {

        //task1
        int[] randomNumbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(randomNumbers));

/*
            //Task2, 3
            Scanner scanner = new Scanner(System.in);
            int userInput;

            while (true) {
                System.out.print("Enter a number between 1 and 20: ");
                if (scanner.hasNextInt()) {
                    userInput = scanner.nextInt();
                    if (userInput >= 1 && userInput <= 20) {
                        break;
                    }
                } else {
                    scanner.next(); // Clear the invalid input
                }
                System.out.println("Invalid input. Please enter a number between 1 and 20.");
            }

            System.out.println("Valid input: " + userInput);



        //Task4
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Populate the collection with integers
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);

        System.out.print("Enter a number: ");
        int target = scanner.nextInt();

        Set<String> pairs = new HashSet<>();

        // Find pairs that add up to the target number
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int num1 = numbers.get(i);
                int num2 = numbers.get(j);

                if (num1 + num2 == target) {
                    String pair = "(" + num1 + ", " + num2 + ")";
                    pairs.add(pair);
                }
            }
        }

        if (pairs.isEmpty()) {
            System.out.println("No pair of integers in the collection that add up to be equal to the number entered.");
        } else {
            System.out.println("Pairs of integers that add up to " + target + ":");
            for (String pair : pairs) {
                System.out.println(pair);
            }
        }*/

        //Task5
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers separated by commas (,):");
        String input = scanner.nextLine();

        String[] numberStrings = input.split(",");
        if (numberStrings.length != 10) {
            System.out.println("Invalid input. Please enter only 10 numbers.");
            return;
        }

        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString.trim());
                if (number < 0 || number > 9) {
                    throw new NumberFormatException();
                }
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers ranging from 0 to 9.");
                return;
            }
        }

        System.out.println("Entered numbers: " + numbers);
    }
}


