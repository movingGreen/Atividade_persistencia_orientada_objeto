package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Classe.Buraco

/**
 *
 * @author el_va
 */
public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = factory.createEntityManager();

        Buraco buraco_rua = new Buraco();
        buraco_rua.setRua("Rua b");
        buraco_rua.setQuantidade("10");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(buraco_rua);
        tx.commit();
        em.close();
        factory.close();
        
        System.out.println("Cadastrado com sucesso!");
    }

   
}