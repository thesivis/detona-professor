package br.ufmt.alg3.curso;

import br.ufmt.alg3.Identificador;

public class Curso extends Identificador {

    private String periodo; //Mat, Vesp, Not
    private String rga;

    public Curso(){
        periodo = "Matutino";
    }

    public Curso(String nome){
        this.nome = nome;
        this.periodo = "Noturno";
    }

    public void setRga(String rga){
        this.rga = rga;
    }

    public String getRga(){
        return rga;
    }

    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    public String getPeriodo(){
        return periodo;
    }

    public String imprimir(String texto){
        return texto + " " + super.imprimir();
    }

    public String imprimir(int pos){
        return pos + " " + imprimir();
    }

    public String imprimir(){
        return "Curso " + nome; 
    }
}
