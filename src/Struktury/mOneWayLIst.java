package Struktury;

public class mOneWayLIst {
    OneWayListElement _head;
    int _counter;

    //DODAWANIE ELEMENTU NA POCZATKU I KONCU LISTY

    public void addElementAtBeginng(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = _head;
        _head = p;
        _counter++;
    }

    public void deleteElementAtBeginning() {
        OneWayListElement p = _head;
        if (p != null) {
            _head = p.next;
            p = null;
        }
        _counter--;
    }

    public OneWayListElement getLastElement() {
        OneWayListElement iterator;
        iterator = _head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        return iterator;
    }

    public void addElementAtEnd(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = null;

        if (_counter == 0) {
            _head = p;
        } else {
            OneWayListElement iterator = _head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = p;
        }
        _counter++;
    }

    public void deleteElementAtEnd() {
        OneWayListElement iterator = _head; //ustawiamy wskaźnik, który będzie przechodził po całej liście
        //na głowę
        if (_counter == 0) //jeżeli lista jest pusta
            return; //kończymy - nie mamy czego usuwać

        //w przeciwnym razie idziemy na koniec listy
        if (iterator.next != null) //jeżeli mamy następnika
        {
            while (iterator.next.next != null) //jeżeli następnik następnika nie jest ostatnim elementem
            //zatrzymujemy się w przedostatnim elemencie
            {
                iterator = iterator.next; //przechodzimy do następnego elementu
            }
            iterator.next = null; //skoro znaleźliśmy przedostatni element to one teraz staje się ostatnim
        } else //w przeciwnym razie jesteśmy smutną listą jednoelementową
        {
            _head = null; //Usuwamy jedyny element, więc głowa jest pusta
            iterator = null; //czyścimy iterator - sprzątamy po sobie
            _counter--;
        }

    }

    public void addElementBeforeElement(int elementToAdd, int beforeElement) {
        OneWayListElement elementBefore = getElementForward(beforeElement);
        //wyszukujemy nasz element

        if (elementBefore == _head) //jeżeli element przed który chcemy dodać jest głową
        {
            addElementAtBeginng(elementToAdd); //skorzystajmy z metody dodawania na początku listy
        } else //w przeciwnym razie musimy jeszcze raz wyszukać nasz element
        //tym razem musimy zatrzymać się na elemencie przed nim
        //żeby pozmieniać wskaźniki
        {
            OneWayListElement iterator = _head;
            while (iterator.next != elementBefore) //dopóki nie znajdziemy
            //elementu, któego następnikiem jest element przed który chcemy wstawić
            {
                iterator = iterator.next; //przechodzimy do następnego elementu
            }

            OneWayListElement newElement = new OneWayListElement();
            newElement.data = elementToAdd;
            newElement.next = iterator.next; //następnikiem nowego elementu staje się element przed który chcemy dodać
            iterator.next = newElement; //iteratorem zatrzymaliśmy się przed elementem przed którym chcemy dodać
            //więc następnikiem tego elementu staje się nasz element
        }
        _counter++;
    }

    public void addElementAfterElement(int elementToAdd, int afterElement) {
        OneWayListElement elementAfter = getElementForward(afterElement); //wyszukujemy element za który chcemy dodać

        OneWayListElement newElement = new OneWayListElement();
        newElement.data = elementToAdd;
        newElement.next = elementAfter.next; //następnikiem naszego elementu jest następnik elelemntu za który chcemy wstawić

        elementAfter.next = newElement; //następnikiem elementu za który chcemy wstawić stajemy się my
        _counter++;
    }

    public void deleteElement(int elementToDelete) {
        OneWayListElement toDelete = getElementForward(elementToDelete); //wyszukujemy element do usunięcia

        if (_head == toDelete) //jeżeli okazało się, że w głowie
        //znajduje się element do usunięcia
        {
            deleteElementAtBeginning(); //korzystamy z metody do usunięcia na początku listy
        } else //w przeciwnym wypadku musimy znaleźć elementu przed elementem do usunięcia
        {
            OneWayListElement iterator = _head; //tworzymy iterator, którym będziemy wyszukiwać elememt
            //i od razu przypisujemy mu wskazanie na głowę
            while (iterator.next != toDelete)//przechodzimy aż zatrzymamy się w elemencie, który
            //znajduje się przed elementem do usunięcia
            {
                iterator = iterator.next; //przechodzimy do następnego elementu
            }
            iterator.next = toDelete.next; //przepisujemy następnik elementu usuwanego do następnika elementu
            //przed tym do usunięcia
            toDelete = null; //robimy porządek i usuwamy nasz element
        }
    }

    //SEKCJA POMOCNICZO - TECHNICZNA
    public OneWayListElement getElementForward(int data) //metoda zwraca pierwszy element, który przechowuje
    //zadeklarowaną przez nas wartość
    {
        OneWayListElement p = _head; //zaczynamy wyszukiwanie od głowy
        while (p.next != null) //przechodzimy dopóki mamy następnik
        {
            if (p.data == data) {
                break; //jeżeli udało nam się znaleźć element to kończymy wykonywanie pętli
            }
            p = p.next;
        }

        return p; //jeżeli nie mamy następnika lub przerwaliśmy pętle zwracamy p (pierwszy element z wartością
        //którą chcemy uzyskać lub ogon z listy)
    }

    public void printAllElements() //metoda drukuje całą listę od pierwszego elementu (głowy) do ostatniego
    // - ogona
    {
        OneWayListElement p = _head; //zaczynamy wyszukiwanie od głowy
        while (p != null) //przechodzimy dopóki mamy jakąkolwiek wartość (łącznie z ostatnim elementem)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }
}




