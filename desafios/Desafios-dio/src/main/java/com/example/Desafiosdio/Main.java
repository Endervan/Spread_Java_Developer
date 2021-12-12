package com.example.Desafiosdio;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao java");
        curso.setCargaHoraria(4);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso lavarel");
        curso1.setDescricao("Descricao Lavarel");
        curso1.setCargaHoraria(8);

        // polimorfismo => tudo curso tei conteudo mas nei todooo curso tei conteudo
        //Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em java");
        mentoria.setDescricao("Mentoria em java");
        mentoria.setData(LocalDate.now()); // cria data de criacao instataneo

//        System.out.println(curso);
//        System.out.println(curso1);
//        System.out.println(mentoria);

//        Conteudo conteudo = new Conteudo();


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("------------------");

        Dev devEnder = new Dev();
        devEnder.setNome("Ender");
        devEnder.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Ender" + devEnder.getConteudosInscritos());
        System.out.println("------------------");
        devEnder.progredir();
        System.out.println("Conteudo Inscrito Ender Avancando" + devEnder.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Ender" + devEnder.getConteudosConcluidos());
        System.out.println("Xp Ender ganhou " + devEnder.calcularTotalXp());

        System.out.println("------------------");
        Dev devAlves = new Dev();
        devAlves.setNome("Alves");
        devAlves.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Alves " + devAlves.getConteudosInscritos());
        devAlves.progredir();
        devAlves.progredir();
        devAlves.progredir();
        System.out.println("------------------");
        System.out.println("Conteudo Inscrito Alves avanvando" + devAlves.getConteudosConcluidos());
        System.out.println("Xp  Alves Ganhou " + devAlves.calcularTotalXp());


    }


}
