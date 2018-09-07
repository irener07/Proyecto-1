package library;

import structure.LinkedList;
import structure.LinkedListNode;

public class LibraryManagement {

    //se crea la lista que de librerias
    private LinkedList<Library> Libraries;

    //gets and sets de la lista 
    public LinkedList<Library> getLibraries() {
        return Libraries;
    }

    public void setLibraries(LinkedList<Library> Libraries) {
        this.Libraries = Libraries;
    }

    //constructor de la lista
    public LibraryManagement() {
        this.Libraries = new LinkedList<Library>();
    }

    public void create(String name, String country, String location, String horary, int phoneNumber) {
        Library newLibrary = new Library(name, country, location, horary, phoneNumber);
        this.Libraries.insert(newLibrary);
    }

    public void delete() {
        //Libraries.Delete(element);
    }

    public String Ask() {
        return Libraries.toString();
    }

}
