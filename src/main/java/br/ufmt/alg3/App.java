package br.ufmt.alg3;

import java.util.Scanner;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.curso.CursoDAO;
import br.ufmt.alg3.curso.CursoDAOImpl;
import br.ufmt.alg3.professor.Professor;

public class App
{
    public static void main( String[] args )
    {
        // https://github.com/thesivis/detona-professor
        Curso c = new Curso();
        c.setNome("SI");
        CursoDAO banco = new CursoDAOImpl();
        banco.inserir(c);
    }

}
