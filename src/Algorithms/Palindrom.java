package Algorithms;

public class Palindrom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "palindrom";
    }

    @Override
    public void runAlgorithm(String[] input) {

        //array of numbers to be checked
        String numbers = Integer.parseInt(input[1]);
        char numbersToChar = numbers.toCharArray();

        //iterate through the numbers
        for (int i = 0; i < numbersToChar.length; i++) {
            numbersToChar = numbersToChar[i];
            int reversedNumber = 0;
            int temp = 0;

            //reverse the number
            while (number > 0) {
                temp = number % 10;
                number = number / 10;
                reversedNumber = reversedNumber * 10 + temp;
            }

            if (numbers[i] == reversedNumber)
                System.out.println(numbers[i] + " is a palindrome number");
            else
                System.out.println(numbers[i] + " is not a palindrome number");
        }
    }
}
