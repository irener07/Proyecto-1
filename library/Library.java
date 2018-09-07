package library;

import structure.DoubleLinkedList;

public class Library {

    //crea los atributos de las librerias
    private String name, country, location, horary;
    private int phoneNumber;
    private DoubleLinkedList Inventory;

    //crea los getters and setters de todos los satributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHorary() {
        return horary;
    }

    public void setHorary(String horary) {
        this.horary = horary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DoubleLinkedList getInventory() {
        return Inventory;
    }

    public void setInventory(DoubleLinkedList Inventory) {
        this.Inventory = Inventory;
    }

    //constructor que crea las librerias de con todos los atributos
    public Library(String name, String country, String location, String horary, int phoneNumber, DoubleLinkedList Inventory) {
        this.name = name;
        this.country = country;
        this.location = location;
        this.horary = horary;
        this.phoneNumber = phoneNumber;
        this.Inventory = Inventory;
    }

    //muestra todos los los atributos de la libreria
    @Override
    public String toString() {
        return "Library{" + "name=" + name + ", country=" + country + ", location=" + location + ", horary=" + horary + ", phoneNumber=" + phoneNumber + ", Inventory=" + Inventory + '}';
    }

}
