package structure;

public class DoubleLinkedNode<L> {

    private L element;
    private DoubleLinkedNode<L> prev;
    private DoubleLinkedNode<L> next;

    //se crean los getters and setters
    public L getElement() {
        return element;
    }

    public void setElement(L element) {
        this.element = element;
    }

    public DoubleLinkedNode<L> getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedNode<L> prev) {
        this.prev = prev;
    }

    public DoubleLinkedNode<L> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode<L> next) {
        this.next = next;
    }

//se crea el constructor
    public DoubleLinkedNode(L element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "element=" + element;
    }
}
