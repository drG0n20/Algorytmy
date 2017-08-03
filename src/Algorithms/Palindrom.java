//package Algorithms;
//
//public class Palindrom extends AbstractAlgorithm {
//    @Override
//    public String getName() {
//        return "palindrom";
//    }
//
//
//    @Override
//    public void runAlgorithm(String[] input) {
//
//        int n = Integer.parseInt(input[1]);
//        int reverse = 0;
//        int temp = 0;
//
//        //reverse
//        while (n != 0) {
//            temp = n % 10;
//            reverse = reverse * 10 + temp;
//            n = n / 10;
//        }
//
//        //check if n is a palindrome
////        if (reverse == n) {
////            return true;
////        } else {
////            return false;
////        }
//
//    private void sum(int n) {
//        n = Integer.parseInt(input[1]);
//        int reverse = 0;
//        if (n == reverse) {
//            System.out.println("Number is a palindrome");
//        } else {
//            while (n != reverse) {
//                int sum = n + reverse;
//
//                System.out.println(n + " + " + reverse + " = " + sum);
//
//                n = sum;
//            }
//        }
//    }
//}
//}
//
//
//
