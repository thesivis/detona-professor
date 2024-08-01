package br.ufmt.alg3;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

public class App
{
    public static void main( String[] args )
    {
        Curso c = new Curso("SI");
        System.out.println(c.getNome());

        System.out.println(c.getPeriodo());
    }
}
