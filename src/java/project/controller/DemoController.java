/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import project.dao.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DA CUOI
 */
@ManagedBean(name = "demoController")
@ViewScoped
public class DemoController {
    private String str;
    static SessionFactory factory;
    public void abc(){
         //factory = new Configuration().configure().buildSessionFactory();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try{
           tx = session.beginTransaction();
           List employees = session.createQuery("FROM Abc").list(); 
           for (Iterator iterator = 
                             employees.iterator(); iterator.hasNext();){
              //Abc employee = (Abc) iterator.next(); 
              //str = employee.getName();
           }
           tx.commit();
        }catch (HibernateException e) {
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        }finally {
           session.close(); 
        }
     
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    
}
