package cl.model.pojos;
// Generated 03/07/2019 11:56:36 AM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private int precio;
     private int stock;
     private String descripcion;

    public Producto() {
    }

    public Producto(String nombre, int precio, int stock, String descripcion) {
       this.nombre = nombre;
       this.precio = precio;
       this.stock = stock;
       this.descripcion = descripcion;
    }

    public Producto(Integer codigo, String nombre, int precio, int stock, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
    }
    
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


