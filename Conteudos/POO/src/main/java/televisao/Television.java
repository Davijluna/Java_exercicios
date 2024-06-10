package televisao;

/**
 *
 * @author davi
 */
public class Television {
    
    int MAX_VOLUME = 30;
    int volume = 0;
    
    boolean isOn = false;
    
//  Definindo os todos os objetos.
        String brand;
        String model; 
        int size;

//        Construtor recebendo os três parâmetros.
    public Television(String brand, String model, int size) {
//        System.out.println("Construtor da class Television sendo executado.");
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
    
    public void turnOn() {
        System.out.println("Ligando Televisão...");
        this.isOn = true;
        
    }
    
    public void turnOff() {
        System.out.println("Desligando Televisão...");
        this.isOn = false;
    }
    
    public String info() {
        return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn);
    }
    
    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }
    
    public void decreaseVolume() {
        if (volume > MAX_VOLUME) {  
            volume--;
        }
    }
}