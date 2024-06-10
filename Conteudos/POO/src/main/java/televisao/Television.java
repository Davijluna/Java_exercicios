package televisao;

/**
 *
 * @author davi
 */
public class Television {
    
    boolean isOn = false;
    
//  Definindo os todos os objetos.
        String brand;
        String model; 
        int size;

//        Construtor resebendo os três parâmetros.
    public Television(String brand, String model, int size) {
//        System.out.println("Construtor da class Television sendo executado.");
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
}