public class FormatadorCep {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("23765064");
       System.out.println(cepFormatado);
            
        } catch (CepInvalidoException e) { //criando nossa propriaa exceção
        System.out.println("o cep nao corresponde a regra");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
