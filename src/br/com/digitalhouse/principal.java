package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String[] args) {

        Curso cursoAndroid = new Curso("Mobile Android");
        Curso Fullstack = new Curso("Web Fullstack");

        Aluno vini = new Aluno(123, "Vinicius", "Oliveira", cursoAndroid);
        Aluno vinicius = new Aluno(12365, "Vinicius", "Oliveira", cursoAndroid);
        Aluno Jessica = new Aluno(321, "Jessica", "Milena", Fullstack);
        Aluno Thiago = new Aluno(312, "Thiago", "Guilherme", Fullstack);
        Aluno Jair = new Aluno(231, "Jair", "Ribeiro", cursoAndroid);


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        alunos.add(Jessica);
        alunos.add(Thiago);
        alunos.add(Jair);


        System.out.println(
                //vini.equals(vinicius));

                //alunos.contains(vinicius)

                alunos
        );


    }


}
