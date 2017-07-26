package Algorithms;


public class AlgorytmBabelkowy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "algorytmbabelkowy";

//        private int[] tab = [5, 4, 3, 2, 1];
    }

    @Override
    public void runAlgorithm(String[] input) {
//        int tab = Integer.parseInt(input[1]);
        int tab[] = new int[input.length - 1];

        int temp;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }
}
