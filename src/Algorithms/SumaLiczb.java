package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumaLiczb extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "sumaliczb";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int sum = 0;

        for (int i= 0; i > Integer.parseInt(input[1]); i++ ) {
        sum = sum + input;
        }

        System.out.println(sum);


    }
}
