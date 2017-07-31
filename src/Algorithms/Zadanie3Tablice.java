package Algorithms;

public class Zadanie3Tablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "zadanie3tablice";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length - 1;
        int max = 0;

        int[] T = new int[n];

        for (int i = 0; i < T.length; i++) {
            T[i] = Integer.parseInt(input[i + 1]);
            if (T[i] > max) {
                max = T[i];
            }
        }

        int[] W = new int[max + 1];
        for (int i = 0; i < T.length; i++) {
            int najwiekszaWart = T[i];
            W[najwiekszaWart]++;
        }

        int wynik = 0;

        for (int i = 0; i < W.length; i++) {
            if (W[i] > W[wynik]) ;
            wynik = i;
        }

        System.out.println(wynik);

    }
}
