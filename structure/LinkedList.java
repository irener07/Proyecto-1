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
        LinkedListNode<L> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new LinkedListNode<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    //permite eliminar el primer nodo de la lista
    private void DeleteFrist() {
        LinkedListNode<L> temp = head;
        head = head.getNextNode();
        temp.setNextNode(null);
        size--;
    }

    //permite eliminar el ultimo nodo de la lista 
    private void DeleteFinal() {
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

    //elimina un solo nodo
    private void DeleteOnly1(L element) {
        head = null;
        tail = head;
        size--;
    }

    //permite elimar un elemnto de una lista de size 2
    private void DeleteOnly2(L element) {
        if (head.getElement().equals(element)) {
            DeleteFrist();
        } else if (tail.getElement().equals(element)) {
            DeleteFinal();
        }
    }

    private void DeleteWherever(L element) {
        LinkedListNode<L> tempNode, tempPrev, tempNext;
        tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getNextNode().getElement().equals(element)) {
                tempPrev = tempNode;
                tempNode = tempNode.getNextNode();
                tempNext = tempNode.getNextNode();
                tempPrev.setNextNode(tempNext);
                tempNode.setNextNode(null);
            } else {
                tempNode = tempNode.getNextNode();
            }
        }
        size--;
    }

    public void Delete(L element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                DeleteFinal();
            } else if (head.getElement().equals(element)) {
                DeleteFrist();
            } else if (size == 1) {
                DeleteOnly1(element);
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
        LinkedListNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNextNode();
        }
        return msg;
    }
}
