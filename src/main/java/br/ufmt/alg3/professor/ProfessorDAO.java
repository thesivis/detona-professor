package br.ufmt.alg3.professor;

import java.util.List;

public interface ProfessorDAO {
    
    public void inserir(Professor professor);

    public void remover(Professor professor);

    public void atualizar(Professor professor);

    public List<Professor> leitura();
}
