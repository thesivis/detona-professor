package br.ufmt.alg3.curso;

public class Curso {

    private String nome;
    private String periodo; //Mat, Vesp, Not
    private float nota; //Estrela 0-5 fracionada
    private String comentario;
    private String rga;
    private String semestre; //2024/1

    public Curso(){
        periodo = "Matutino";
    }

    public Curso(String nome){
        this.nome = nome;
        this.periodo = "Noturno";
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    public String getSemestre(){
        return semestre;
    }

    public void setRga(String rga){
        this.rga = rga;
    }

    public String getRga(){
        return rga;
    }

    public void setNota(float nota){
        this.nota = nota;
    }

    public float getNota(){
        return nota;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return comentario;
    }

    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    public String getPeriodo(){
        return periodo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}
