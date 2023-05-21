package edu.kis.vh.nursery.list;

class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     * Dodanie wartości do węzła
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Odczytanie wartości węzła
     */
    public int getValue() {
        return value;
    }

    /**
     * Odczytanie wartości z poprzedniego węzła
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Ustawienie wartości poprzedniego węzła
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Odczytanie wartości z następnego węzła
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawienie wartości następnego węzła
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    /**
     * Dodanie węzła do końca listy
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdzenie czy lista jest pusta
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdzenie czy lista jest pełna
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Pobranie wartości ze szczytu listy
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Usunięcie węzła z końca listy i zwrócenie jego wartości
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
