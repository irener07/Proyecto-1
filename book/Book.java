package business.book;

import structure.DoubleLinkedList;


public class Book {
 
    //Atributos de la clase
    private int ID, CantidadVendida, CantidadDisponible, precio;
    private String nombre, tema, descripcion;
   
    //Falta imagen
    private DoubleLinkedList Inventory;
  
    public int getID(){
            return ID;}

    public void setID(int ID){
            this.ID =ID;}

    public int getCantidadVendida(){
            return CantidadVendida;}

    public void setCantidadVendida(int CantidadVendida){
            this.CantidadVendida =CantidadVendida;}

    public int getCantidadDisponible(){
            return CantidadDisponible;}

    public void setCantidadDisponible(int CantidadDisponible){
            this.CantidadDisponible =CantidadDisponible;}

    public int getprecio(){
            return precio;}

    public void setprecio(int precio){
            this.precio =precio;}

    public String getnombre(){
            return nombre;}

    public void setnombre(String nombre){
            this.nombre=nombre;}

    public String gettema(){
            return tema;}

    public void settema(String tema){
            this.tema=tema;}

    public String getdescripcion(){
            return descripcion;}

    public void setdescripcion(String descripcion){
            this.descripcion=descripcion;}

    public DoubleLinkedList getInventory;static {
}

    public void setInventory(DoubleLinkedList Inventory){
            this.Inventory= Inventory;}

    public Book(int ID, int CantidadVendida, int CantidadDisponible, int precio,String nombre, String tema, String descripcion, DoubleLinkedList Inventory){
            this.ID = ID;
            this.CantidadVendida = CantidadVendida;
            this.CantidadDisponible = CantidadDisponible;
            this.precio = precio;
            this.nombre = nombre;
            this.tema = tema;
            this.descripcion = descripcion;
            this.Inventory =Inventory;
    }
    public Book(int ID, int CantidadVendida, int CantidadDisponible, int precio,String nombre, String tema, String descripcion){
            this.ID = ID;
            this.CantidadVendida = CantidadVendida;
            this.CantidadDisponible = CantidadDisponible;
            this.precio = precio;
            this.nombre = nombre;
            this.tema = tema;
            this.descripcion = descripcion;
    }        
    @Override
    public String toString(){
        return "Book{"+ "ID:"+ID+ ", CantidadVendida:" +CantidadVendida+ ", CantidadDisponible:" +CantidadDisponible+ ", Precio:" +precio + ", Nombre:" 
                + nombre + ", Tema:" + tema + ", Decripcion:" + descripcion +"}";
        
                
    }
   
    
}
