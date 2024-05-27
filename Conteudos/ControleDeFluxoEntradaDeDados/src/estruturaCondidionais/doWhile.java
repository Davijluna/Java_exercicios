package estruturaCondidionais;

import java.util.Random;


public class doWhile {
    
    public static void main(String[] args) {
        
        int tentativa = 0;
        int atendeu = 0;
        String log;
        
        do {
            log = "Ligando para conditado selecionado ...\n";
            
            atendeu = new Random().ints(0,2).findFirst().getAsInt();
            tentativa += 1;
        } while (atendeu == 0 && tentativa < 3 );
        
        log = "Candidato atendeu na tentativa:" + tentativa;
        System.out.println(log);
    }
    
}
