package Struktury;

public class Kopiec {
    int _date[];
    int _counter = 0;

    public Kopiec(int n) {
        _date = new int[n];
    }

    public void insertElement(int element) {
        int i = _counter++;
        int j = (i - 1) / 2;

        while (i > 0 && _date[j] < element) {
            _date[i] = _date[j];
            i = j;
            j = (i - 1) / 2;
        }
        _date[i] = element;
    }

    public void printAllElements() {

        for (int i = 0; i < _date.length; i++) {
            System.out.println(_date[i]);
        }
    }

//    public void sort() {
//        int temp = 0;
//        for (int i = 0; i < _date.length; i++) {
//            for (int j = 0; j < _date.length; j++) {
//                if (_date[j] < _date[j + 1]) {
//                    temp = _date[j + 1];
//                    _date[j] = _date[j + 1];
//                    _date[j + 1] = temp;
//                }
//            }
//        }
//    }
}

