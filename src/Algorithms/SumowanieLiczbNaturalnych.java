package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumowanieLiczbNaturalnych extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "sumowanieliczbnaturalnych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]); // t=i
        int suma = 0; //t=i
        int i = 1; // t=i

        while ( i < n) {
            suma += 1;
//            System.out.printf("Iteracja: %d  ::: Wartosc sumy: %d \n ", i, suma);
            i++;
        }
        System.out.println(suma);
    }




}
