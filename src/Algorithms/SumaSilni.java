package Algorithms;

import javax.sound.midi.Soundbank;

/**
 * Created by RENT on 2017-07-25.
 */
public class SumaSilni extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Suma Silni";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(SumaSilni(n));
    }

    private int SumaSilni(int n) {
        if (n<2)
            return 1;
        return n + SumaSilni(n-1);
    }

}
