package structure;

public class DoubleLinkedList<L> {

    //Crea los atributos
    private DoubleLinkedNode<L> head;
    private DoubleLinkedNode<L> tail;
    private int size;

    // Crea los getters and setters para los atributos
    public DoubleLinkedNode<L> getHead() {
        return head;
    }

    public void setHead(DoubleLinkedNode<L> head) {
        this.head = head;
    }

    public DoubleLinkedNode<L> getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedNode<L> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // inserta datos al final de la lista
    public void insert(L element) {
        if (isEmpty()) {
            head = new DoubleLinkedNode(element);
            tail = head;
            size++;
        } else {
            tail.setNext(new DoubleLinkedNode(element));
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
            size++;
        }
    }

    //permite consultar el elemnto del nodo consultado 
    public L consult(L element) {
        DoubleLinkedNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement() == element) {
                break;
            } else {
                temp = temp.getNext();
            }
        }
        return temp.getElement();
    }

    //actualiza los elementos de los nodos
    public void update(L initialElem, L replacedElem) {
        DoubleLinkedNode<L> temp;
        DoubleLinkedNode<L> replacedNode, tempPrev, tempNext;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(initialElem)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();

                replacedNode = new DoubleLinkedNode<>(replacedElem);
                tempPrev.setNext(replacedNode);
                tempNext.setPrev(replacedNode);
                replacedNode.setPrev(tempPrev);
                replacedNode.setNext(tempNext);

                temp.setPrev(null);
                temp.setNext(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
    }

    //permite eliminar el primer nodo de la lista
    private void DeleteFrist() {
        DoubleLinkedNode<L> temp = head;
        head = head.getNext();
        temp.setNext(null);
        head.setPrev(null);
        size--;
    }

    //permite eliminar el ultimo nodo de la lista 
    private void DeleteFinal() {
        DoubleLinkedNode<L> temp = tail;
        tail = tail.getPrev();
        temp.setPrev(null);
        tail.setNext(null);
        size--;
    }

    //elimina un solo nodo
    private void deleteUniqueElement(L element) {
        if (head.getElement().equals(element)) {
            head = null;
            tail = head;
            size--;
        }
    }

    //permite elimar un elemnto de una lista de size 2
    private void DeleteOnly2(L element) {
        if (head.getElement().equals(element)) {
            DeleteFrist();
        } else if (tail.getElement().equals(element)) {
            DeleteFinal();
        }
        size--;
    }

    //permite eliminar los elementos en cualquier parte de la lista
    private void DeleteWherever(L element) {
        DoubleLinkedNode<L> temp;
        DoubleLinkedNode<L> tempNext, tempPrev;
        temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();
                tempNext.setPrev(tempPrev);
                tempPrev.setNext(tempNext);
                temp.setNext(null);
                temp.setPrev(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
        size--;
    }

    //elimina cualquier nodo,dependiendo del size
    public void Delete(L element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                DeleteFinal();
            } else if (head.getElement().equals(element)) {
                DeleteFrist();
            } else if (size == 1) {
                deleteUniqueElement(element);
            } else if (size == 2) {
                DeleteOnly2(element);
            } else if (size >= 3) {
                DeleteWherever(element);
            }
        }
    }

    //permite conocer los elementos del nodo desde el primero hasta el ultimo
    @Override
    public String toString() {
        String msg = "";
        DoubleLinkedNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString() + "\n";
            temp = temp.getNext();
        }
        return msg;
    }

    //permite conocer los elementos del nodo desde el ultimo hasta el primero
    public String toStringReverse() {
        String msg = "";
        DoubleLinkedNode<L> temp = tail;
        for (int i = 0; i < size; i++) {
            msg += temp.toString() + "\n";
            temp = temp.getPrev();
        }
        return msg;
    }
}
