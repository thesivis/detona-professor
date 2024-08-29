package br.ufmt.alg3.curso;

import java.util.List;

public interface CursoDAO {
    
    public void inserir(Curso curso);

    public void remover(Curso curso);

    public void atualizar(Curso curso);

    public List<Curso> leitura();
}
