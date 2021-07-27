/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author Iago
 */
public class Curso {
    private Integer id;
    private String nome;
    /**
     * @return the id
     */
    public Curso(String nome){
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
   
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
