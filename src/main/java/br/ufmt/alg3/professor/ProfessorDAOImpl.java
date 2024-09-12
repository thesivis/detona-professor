package br.ufmt.alg3.professor;

import java.util.ArrayList;
import java.util.List;

import br.ufmt.alg3.Utils;

public class ProfessorDAOImpl implements ProfessorDAO {

    private List<Professor> banco = new ArrayList<>();

    public void inserir(Professor professor) {
        System.out.println("Inserindo professor");
        banco.add(professor);
    }

    public void remover(Professor professor) {
        System.out.println("Removendo professor");
        banco.remove(professor);
    }

    public void atualizar(Professor professor) {
        System.out.println("Atualizando professor");
        int idx = banco.indexOf(professor);
        if (idx != Utils.NAO_ACHOU) {
            banco.set(idx, professor);
        }
    }

    public List<Professor> leitura() {
        return banco;
    }
    
}
