
public class App {

    public static void main(String[] args) throws Exception {

        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.setComportamento(defensivo);

        robo.mover();
        robo.setComportamento(agressivo);

        robo.mover();
    }
}
