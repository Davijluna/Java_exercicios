package televisao;

/**
 *
 * @author davi
 */
public class Application {
    
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema ...");
        
        Television television = new Television("Phillips","LCD", 32);
                
//        television.volume = 100;
//        television.volume = -1;
        
        television.turnOn();
        television.turnOff();
        System.out.println(television.info());
        
        System.out.println("Finalizando sistema ...");
    }
    
}
