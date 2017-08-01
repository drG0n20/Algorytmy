package Algorithms;

import Struktury.mList;

public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "testowanielisty";
    }

    @Override
    public void runAlgorithm(String[] input) {

        mList lista = new mList();

        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.addElementBefore(45, 14, lista);
        lista.addElementAfter(23, 45, lista);
        lista.addElementAtEnd(66, lista);
        lista.addElementAtBeginning(01, lista);
        lista.printAllEllements(lista);
    }
}
