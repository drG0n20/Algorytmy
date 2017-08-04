//package Struktury;
//
//public class mOneWayLIst {
//    OneWayListElement _head;
//    int _counter;
//
//    //DODAWANIE ELEMENTU NA POCZATKU I KONCU LISTY
//
//    public void addElementAtBeginng(int newElement) {
//        OneWayListElement p = new OneWayListElement();
//        p.data = newElement;
//        p.next = _head;
//        _head = p;
//        _counter++;
//    }
//
//    public OneWayListElement getLastElement() {
//        OneWayListElement iterator;
//        iterator = _head;
//        while (iterator.next != null) {
//            iterator = iterator.next;
//        }
//        return iterator;
//    }
//
//    public void addElementAtEnd(int newElement) {
//        OneWayListElement p = new OneWayListElement();
//        p.data = newElement;
//        OneWayListElement lastOne = getLastElement();
//        lastOne.next = p;
//    }
//
//    public void printAllElements() {
//        Element p = _head;
//        while (p != null) {
//            System.out.println(p.data);
//            p = p.next;
//        }
//    }
