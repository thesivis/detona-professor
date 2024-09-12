package br.ufmt.alg3.curso;

import java.util.ArrayList;
import java.util.List;

import br.ufmt.alg3.Utils;

public class CursoDAOImpl implements CursoDAO {

    private List<Curso> banco = new ArrayList<Curso>();
    
    public void inserir(Curso curso){
        System.out.println("Inserindo curso");
        try {
            curso.validar();
            banco.add(curso);
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    public void remover(Curso curso){
        System.out.println("Removendo Curso");
        banco.remove(curso);
    }

    public void atualizar(Curso curso){
        System.out.println("Atualizando curso");
        try {
            curso.validar();
            int idx = banco.indexOf(curso);
            if (idx != Utils.NAO_ACHOU) {
                banco.set(idx, curso);
            }
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    public List<Curso> leitura(){
        return banco;
    }
}
