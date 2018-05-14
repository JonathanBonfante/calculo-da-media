/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Eduarda.Objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    Prova("Avaliação"),
    Trabalho ("Trabalho"),
    Seminario("Seminário");
    
    private String nome;

    private TipoAvaliacao(String nome) {
        this.nome = nome;
    }

    public static TipoAvaliacao getProva() {
        return Prova;
    }

    public static TipoAvaliacao getTrabalho() {
        return Trabalho;
    }

    public static TipoAvaliacao getSeminario() {
        return Seminario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "TipoAvaliacao{" + "nome=" + nome + '}';
    }
    
    
    
    
    
    
}
