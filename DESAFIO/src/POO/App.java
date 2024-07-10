package POO;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Aprenda java ao básico e POO");
        curso1.setCargaHoraria(86);
        // System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP");
        curso2.setDescricao("Aprenda Php ao básico e POO");
        curso2.setCargaHoraria(86);
        // System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("socorro java");
        mentoria.setDescricao("ajuda me");
        mentoria.setData(LocalDate.now());
        // System.out.println(mentoria);

        // Conteudo conteudo = new Curso();
        // Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setTitulo("java dev");
        bootcamp1.setDescricao("se torne um dev de java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Peu");
        dev.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Peu: " + dev.getConteudosInscritos());
        dev.progredirBootcamp(bootcamp1);
        System.out.println("Conteudos Peu Concluidos : " + dev.getConteudoConcluidos());
        System.out.println("XP do peu: " + dev.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Peu: " + dev2.getConteudosInscritos());
        dev2.progredirBootcamp(bootcamp1);
        System.out.println("Conteudos Joao Concluidos: " + dev2.getConteudoConcluidos());

    }
}
