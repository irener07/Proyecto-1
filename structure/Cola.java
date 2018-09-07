package structure;

import structure.LinkedListNode;

public class Cola<L> {

    //nodos de la la lista cola
    LinkedListNode<L> head, tail;
    int size;

    //getters and setters de los nodos
    public LinkedListNode<L> getHead() {
        return head;
    }

    public void setHead(LinkedListNode<L> head) {
        this.head = head;
    }

    public LinkedListNode<L> getTail() {
        return tail;
    }

    public void setTail(LinkedListNode<L> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //verifica si la lista esta vacia
    public boolean isEmpty() {
        return size == 0;
    }

    // inserta datos al final de la lista
    public void insert(L element) {
        if (isEmpty()) {
            head = new LinkedListNode<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new LinkedListNode<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }
    
    //permite consultar el valor de los nodos
    public L consult(L element) {
        LinkedListNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    //actualiza los elementos de los nodos
    public void update(L Elem, L replacedElem) {
        LinkedListNode<L> temp, tempPrevious, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(Elem)) {
                tempPrevious = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new LinkedListNode<>(replacedElem);
                tempPrevious.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    //elimina el primero de la lista
    public void delete(L element) {
        LinkedListNode<L> temp = head;
        head = head.getNextNode();
        temp.setNextNode(null);
        size--;
    }

    @Override
    public String toString() {
        String message = "";
        LinkedListNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            message+=temp.toString();
            temp=temp.getNextNode();
        }
        return message;
    }

}
