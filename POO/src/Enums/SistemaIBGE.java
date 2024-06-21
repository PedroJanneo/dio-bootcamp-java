package Enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        for ( EstadoBrasileiro e: EstadoBrasileiro.values()){ // e = nome do objeto; : = substituir o "="
            System.out.println(e.getSigla() + "-" + e.getNome() + "-" + e.getIbge());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO; // definindo "eb" cmo objeto do EstadoBrasileiro.sao_paulo
        System.out.println(eb.getNome()); // so vai imprimir SAO PAULO
        System.out.println(eb.getNomeMaiusculo()); // so vai imprimir SAO PAULO
        System.out.println(eb.getSigla()); // so vai imprimir SP
        System.out.println(eb.getIbge()); // so vai imprimir IBGE = 1
    }
}
