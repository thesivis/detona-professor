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
        return texto + " " + this.imprimir();
    }

    public String imprimir(int pos){
        return pos + " " + imprimir();
    }

    @Override //Nao é necessário o Override
    public String imprimir(){
        return "Curso " + nome; 
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((getSemestre() == null) ? 0 : getSemestre().hashCode());
        result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
        result = prime * result + ((rga == null) ? 0 : rga.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Curso c = (Curso) obj;
        if (!this.nome.equals(c.getNome())){
            return false;
        }
        if (!getSemestre().equals(c.getSemestre())){
            return false;
        }
        if(!periodo.equals(c.getPeriodo())) {
            return false;
        }
        if(!rga.equals(c.getRga())){
            return false;
        }
        return true;
    }

    
}
