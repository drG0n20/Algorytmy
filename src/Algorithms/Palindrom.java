//package Algorithms;
//
//public class Palindrom extends AbstractAlgorithm {
//    @Override
//    public String getName() {
//        return "palindrom";
//    }
//
//    @Override
//    public void runAlgorithm(String[] input) {
//
//        String string = input[1];
//        String reverse = new StringBuilder(string).reverse().toString();
//        int length = string.length();
//
//
//        int i;
//        int begin;
//        int end;
//        int middle;
////
////        begin = 0;
////        end = length - 1;
////        middle = Math.floorDiv((begin + end), 2);
//
////        for (i = begin; i <= middle; i++) {
////            if (inputString.charAt(begin) == inputString.charAt(end)) {
////                begin++;
////                end--;
////            } else {
////                break;
////            }
////        }
////
////        if (i == middle + 1) {
////            System.out.println("Palindrome");
////        } else {
////            System.out.println("Not a palindrome");
////        }
//
//        for (i = 0; i < string.length(); i++) {
//            if (string.toCharArray() == reverse.toCharArray()) {
//                System.out.println("Podany string to Palindrom!");
//            } else {
//                char sum[i] =string[i] + reverse[i];
//                System.out.println(sum);
//            }
//        }
//    }
//}
//
//
//
//
