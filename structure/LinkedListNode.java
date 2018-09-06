package structure;

public class LinkedListNode<L> {

    //crea los atributos del Nodo
    private L element;
    private LinkedListNode<L> nextNode;

    //crea los getters and setters delos atributos
    public L getElement() {
        return element;
    }

    public void setElement(L element) {
        this.element = element;
    }

    public LinkedListNode<L> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode<L> nextNode) {
        this.nextNode = nextNode;
    }
    //permite mostrar todos los elementos
    @Override
    public String toString() {
        return "element=" + element;
    }
    //constructor de nodos
    public LinkedListNode(L element) {
        this.element = element;
    }
}
