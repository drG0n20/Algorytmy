package Algorithms;

import Struktury.mList;

import java.util.ArrayList;
import java.util.List;

public class ListaDoTestow extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "listadotestow";
    }

    @Override
    public void runAlgorithm(String[] input) {

        ArrayList<String> listaKolorow = new ArrayList<>();
        listaKolorow.add("niebieski");
        listaKolorow.add("czarny");
        listaKolorow.add("zolty");
        listaKolorow.add("fioletowy");

        listaKolorow.add(0, "rozowy");
        listaKolorow(listaKolorow.size(), "zielony");

        for (String element : listaKolorow) {
            System.out.println(element);
        }


    }
}
