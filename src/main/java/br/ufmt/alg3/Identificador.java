package br.ufmt.alg3;

public class Identificador {
    protected String nome;
    private String semestre; // 2024/1
    private float nota; // Estrela 0-5 fracionada
    private String comentario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String imprimir(){
        return "Identificador: " + nome;
    }
}
