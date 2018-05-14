/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Eduarda.Objeto;

import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author SATC
 */
public class Aluno {
    private String nome;
    private int matricula;
    private List<Nota>notas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        notas = new ArrayList<>();
    }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno: " + "nome=" + nome + ", matricula=" + matricula + ", notas=" + notas + '}';
    }
    
   
    
   
    
    
    
    
}
