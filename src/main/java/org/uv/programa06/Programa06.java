/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa06;

/**
 *
 * @author Yolotzin Groth 
 */

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

public class Programa06 {

    public static void main(String[] args) {
        
    Session session= HibernateUtil.getSession();
    DAOTienda dao= new DAOTienda();
    Tienda tienda= new Tienda();
    tienda.setClave(2);
    tienda.setNombreP("Galletas marinela");
    tienda.setMarca("Marinela");
    tienda.setPrecio("16");
    dao.create(tienda);
    
    System.out.println("Hello World!");
    }
}
