package structure;

public class Pila<L> {

    //se crea los nodos principles de la pila
    LinkedListNode<L> head, tail;
    int size;

    //getter and setters de los nodos
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

    //verifica si la pila esta vacia
    public boolean isEmpty() {
        return size == 0;
    }

    //inserta al inicio de la pila
    public void push(L element) {
        LinkedListNode<L> newNode = new LinkedListNode<>(element);
        if (isEmpty()) {
            head = new LinkedListNode<>(element);
            tail = head;
            size++;
        } else {
            newNode.setNextNode(head);
            head = newNode;
            size++;
        }
    }

    //Metodo que permite poder consultar la informacion del nodo
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

    //permite actualizar la informacion del elemento de cada nodo
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

    //permite eliminar el ultimo nodo añadido
    public void pop(L element) {
        LinkedListNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getNextNode() == tail) {
                tail = temp;
                tail.setNextNode(null);
            } else {
                temp.getNextNode();
            }
        }
        size--;
    }

    @Override
    public String toString() {
        String message = "";
        LinkedListNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            message += temp.toString();
            temp = temp.getNextNode();
        }
        return message;
    }

}
