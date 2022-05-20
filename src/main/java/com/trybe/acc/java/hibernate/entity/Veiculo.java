package com.trybe.acc.java.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidade Veículo.
 *
 */
@Entity
public class Veiculo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private int ano;

  private String modelo;

  private String quilometragem;

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getQuilometragem() {
    return quilometragem;
  }

  public void setQuilometragem(String quilometragem) {
    this.quilometragem = quilometragem;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}

