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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}