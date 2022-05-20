package com.trybe.acc.java.hibernate;

import com.trybe.acc.java.hibernate.entity.Veiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

  /**
   * Método principal.
   * 
   * @param args argumentos da linha de comando
   */
  public static void main(String[] args) {
    String path = "com.trybe.acc.java.hibernate.entity.Veiculo";
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(path);
    
    Veiculo veiculo = new Veiculo();
    veiculo.setAno(2021);
    veiculo.setModelo("Onix");
    veiculo.setQuilometragem("60000");
    
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(veiculo);
    em.getTransaction().commit();
    
    em.close(); 

  }

}
