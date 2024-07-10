package Bootcamp;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Java");
        curso1.setDescricao(" Aprenda java ao básico e POO");
        curso1.setCargaHoraria(86);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo(" PHP");
        curso2.setDescricao(" Aprenda Php ao básico e POO");
        curso2.setCargaHoraria(86);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("socorro java");
        mentoria.setDescricao("ajuda me");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
