package televisao;

/**
 *
 * @author davi
 */
public class Application {
    
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema ...");
        
        Television television = new Television("Phillips","LCD", 32);
        
        System.out.println("Finalizando sistema ...");
    }
    
}
