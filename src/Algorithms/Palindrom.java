package Algorithms;

public class Palindrom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "palindrom";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int numbers[] = new int[]{121,27};

        //iterate through the numbers
        for(int i=0; i < numbers.length; i++){

            int number = numbers[i];
            int reversedNumber  = 0;
            int temp=0;

            //reverse the number
            while(number > 0){
                temp = number % 10;
                number = number / 10;
                reversedNumber = reversedNumber * 10 + temp;
            }

            if(numbers[i] == reversedNumber)
                System.out.println(numbers[i] + " is a palindrome number");
            else
                System.out.println(numbers[i] + " is not a palindrome number");
            int palindromSum = numbers[i]+reversedNumber;
        }

    }
}

