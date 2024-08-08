package br.ufmt.alg3;

import java.util.Scanner;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

public class App
{
    public static void main( String[] args )
    {
        Identificador c = new Curso();
        c.setNome("SI");
        imprimir(c, (Professor) c);
    }

    public static void imprimir(Identificador i, Professor p){
        System.out.println("Identificador Duplo");
        System.out.println(i.imprimir());
    }

    public static void imprimir(Identificador i){
        System.out.println("Identificador");
        System.out.println(i.imprimir());
    }

    public static void imprimir(Professor i){
        System.out.println("Professor");
        System.out.println(i.imprimir());
    }
}
