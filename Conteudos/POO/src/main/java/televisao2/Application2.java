package televisao2;

import televisao.Television;

/**
 *
 * @author davi
 */
public class Application2 {
    
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema ...");
        
        Television television = new Television("Phillips","LCD", 32);
        
        television.turnOn();
        television.turnOff();
        System.out.println(television.info());
        
        System.out.println("Finalizando sistema ...");
    }
    
}
