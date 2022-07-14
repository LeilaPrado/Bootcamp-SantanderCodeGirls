package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo(" curso Java");
        curso1.setDescricao(" descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" curso js");
        curso2.setDescricao(" descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descriao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome(" Leila ");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos: "
                + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos Incritos: "
                + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "
                + dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularTotalXp());

        System.out.println("*------*");
        Dev dev2 = new Dev();
        dev2.setNome(" Marilia ");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos: "
                + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "
                + dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());

    }
}
