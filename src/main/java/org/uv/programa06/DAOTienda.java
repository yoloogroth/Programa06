/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa06;

/**
 *
 * @author Yolotzin Groth Hdez
 */

    import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author carte
 */
public class DAOTienda implements IDAOGeneral<Tienda, Long>{

    @Override
    public  Tienda create(Tienda p) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.save(p);
        Logger.getLogger(DAOTienda.class.getName()).log(Level.INFO,"Se guardo producto");
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Long id) {

        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
       boolean res=false;
        Tienda tienda=findById(id);
        if(tienda==null)
            res= false;
        else{
            session.delete(tienda);
            res= true;
        }
        t.commit();
        session.close();
        return res;
    
    }


    @Override
    public Tienda update(Tienda p, Long id) {

          Session session = HibernateUtil.getSession();
          Transaction t= session.beginTransaction(); 
        Tienda tienda=findById(id);
        if(tienda!=null)
        session.update(tienda);
            
        
        t.commit();
          session.close();
          return tienda;
    }

    @Override
    public List<Tienda> findAll() {

        List<Tienda> lsRes=null;
        Session session = HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        lsRes=session.createQuery("from tienda").list();
        
        t.commit();
        session.close();
        return lsRes;
    }


    @Override
    public Tienda findById(Long id) {

          Tienda tienda=null;
          Session session = HibernateUtil.getSession();
          Transaction t= session.beginTransaction();
          
          tienda=session.get(Tienda.class, id);
          

          t.commit();
          session.close();
          return tienda;
          
    }

 
    
}

