package structure;

public class LinkedList<L> {

    //Crea los atributos
    private LinkedListNode<L> head;
    private LinkedListNode<L> tail;
    private int size;

    // Crea los getters and setters para los atributos
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

    //revisa si la lista esta vacia
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

    //permite consultar el elemnto del nodo consultado 
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
    public void update(L initialElem, L replacedElem) {
        LinkedListNode<L> temp, tempPrevious, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
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

    //elimina los un nodo en cualquier parte de la lista 
    private void DeleteWherever(L element) {
        LinkedListNode<L> tempNode, tempPrevious, tempNext;
        tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getNextNode().getElement().equals(element)) {
                tempPrevious = tempNode;
                tempNode = tempNode.getNextNode();
                tempNext = tempNode.getNextNode();
                tempPrevious.setNextNode(tempNext);
                tempNode.setNextNode(null);
            } else {
                tempNode = tempNode.getNextNode();
            }
        }
        size--;
    }
    
    //metodo principal de eliminar un nodo 
    public void Delete(L element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
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
            } else if (head.getElement().equals(element)) {
                LinkedListNode<L> temp = head;
                head = head.getNextNode();
                temp.setNextNode(null);
                size--;
            } else if (size == 1) {
                head = null;
                tail = head;
                size--;
            } else if (size >= 2) {
                DeleteWherever(element);
            }
        }
    }


    //permite conocer los elementos del nodo desde el primero hasta el ultimo
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
