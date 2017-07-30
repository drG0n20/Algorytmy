package Algorithms;

public class GeneratorPlanszyWarcaby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "generatorplanszywarcaby";

    }

    private String _kolory[] = {"B", "C"};

    @Override
    public void runAlgorithm(String[] input) {

        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        int licznik;

        if (_kolory.equals("B")) {
            licznik = 0;
        } else {
            licznik = 1;
        }

        String[][] tab = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = _kolory[licznik % _kolory.length];
                licznik++;
            }
            licznik++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%s ", tab[i][j]);
            }
            System.out.println();
        }
    }
}

