package Algorithms;

import java.util.ArrayList;
import java.util.Stack;

public class Zadanie4_Stos extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "zadanie4_Stos";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length - 1;
        ArrayList<Integer> lista = new ArrayList<>();
        Stack<Integer> stos = new Stack<>();

        for (int i = 0; i < lista.size(); i++) {
            lista.add(Integer.parseInt(input[i]));
        }

    }
}
