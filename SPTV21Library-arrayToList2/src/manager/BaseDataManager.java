/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author user
 */
import entity.Author;
import entity.Product;
import entity.History;
import entity.Reader;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class BaseDataManager {
    
   private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SPTV21shopBasePU");
    private final EntityManager em = emf.createEntityManager();
    private final EntityTransaction tx = em.getTransaction();
    
    
     public void saveProduct(List<Product> products){
        tx.begin();
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                if(product.getId() == null){
                    em.persist(product);
                }else{
                    em.merge(product);
                }
            }
        tx.commit();
    }
    
    public List<Product> loadProduct() {
        try {
            return em.createQuery("SELECT p FROM Product p")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }}
    
    public void saveReaders(List<Reader> readers){
        tx.begin();
            for (int i = 0; i < readers.size(); i++) {
                Reader reader = readers.get(i);
                if(reader.getId() == null){
                    em.persist(reader);
                }else{
                    em.merge(reader);
                }
            }
        tx.commit();
    }
    
    public List<Reader> loadReaders() {
        try {
            return em.createQuery("SELECT r FROM Reader r")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
    
    
}
