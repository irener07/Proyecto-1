package structure;

public class DoubleLinkedNode<X> {

    private X element;
    private DoubleLinkedNode<X> prev;
    private DoubleLinkedNode<X> next;

    //se crean los getters and setters
    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public DoubleLinkedNode<X> getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedNode<X> prev) {
        this.prev = prev;
    }

    public DoubleLinkedNode<X> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode<X> next) {
        this.next = next;
    }

//se crea el constructor
    public DoubleLinkedNode(X element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "element=" + element;
    }
}
