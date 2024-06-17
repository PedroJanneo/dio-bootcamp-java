public class Metodos {
   
        // nomear os metodos como verbo e usar o camelCase (ex: calcularImposto)
        // dica: tentar usar nome das variaveis/metodos sempre no mesmo idioma
        

        // metodos tem retornos, igual as variaveis ( String, int, double.. caso nao volte um valor "importante" usar VOID)
        
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

       
    public void ligar(){
    ligada=true;
    }
      public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
         volume ++;
    }
    public void diminuirVolume(){
         volume --;
    }
    
    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
        System.out.println("Canal mudando " + canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Canal mudando " + canal );
    }
    }
   

