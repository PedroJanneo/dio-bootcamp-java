public class Ternario {
    public static void main(String[] args) {
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado"; // if / else : resumido
        // resultado = variavel da ternaria

		System.out.println(resultado);

        int nota2 = 6;
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado"; // if / else if / else
        //resultado 2 = variavel do ternario
		System.out.println(resultado2);
    }
}
