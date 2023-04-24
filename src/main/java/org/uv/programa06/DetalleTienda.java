/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa06;

/**
 *
 * @author Yolotzin Groth Hdez
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "DetalleTienda") 
public class DetalleTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClavePro")
    private long ClavePro;
    
    @Column(name = "cant")
    private String cant;
    
    @Column(name = "precio")
    private String precio;
    
    @Column(name = "subto")
    private String subto;
    
    @ManyToOne // Esta anotación indica que el atributo IdVenta es una clave foránea a la tabla Ventas
    @JoinColumn(name = "IdVenta") // Esta anotación indica que la columna que contiene la clave foránea se llama "IdVenta" 
    private Tienda venta;

    public long getClavePro() {
        return ClavePro;
    }

    public void setClavePro(long ClavePro) {
        this.ClavePro = ClavePro;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSubto() {
        return subto;
    }

    public void setSubto(String subto) {
        this.subto = subto;
    }

    public Tienda getVenta() {
        return venta;
    }

    public void setVenta(Tienda venta) {
        this.venta = venta;
    }
}

   