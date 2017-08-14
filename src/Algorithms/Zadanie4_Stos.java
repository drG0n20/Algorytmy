//package Algorithms;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class Zadanie4_Stos extends AbstractAlgorithm {
//    @Override
//    public String getName() {
//        return "zadanie4_Stos";
//    }
//
//    @Override
//    public void runAlgorithm(String[] input) {
//
//
//        // Tworzymy pusta liste
//
//        ArrayList<Integer> lista = new ArrayList<>();
//
//        //wypelniamy liste
//        for (int i = 1; i < input.length; i++) {
//            lista.add(Integer.parseInt(input[i]);
//        }
//
//        for (Integer i : lista) {
//            System.out.printf("Liczby z listy to: %d", i);
//        }
//
//        Stack<Integer> stos = new Stack<>();
//        for (Integer liczby : lista) {
//            stos.push(liczby);
//        }
//        System.out.println();
//    }
//}
