package primeiros.passos.demo;

import org.springframework.stereotype.Component;

@Component
public class calculadora {
    public int somar(int n1, int n2){
        return n1 + n2;
    }
}
