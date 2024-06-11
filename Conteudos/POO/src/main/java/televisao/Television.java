package televisao;

/**
 *
 * @author davi
 */
public class Television {
    
    private int MAX_VOLUME = 30;
    private int volume = 0;
    
    private boolean isOn = false;
    
//  Definindo os todos os objetos.
    private   String brand;
    private String model; 
    private int size;

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
    
    public int getVolume() {
        return volume;
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getSize() {
        return size;
    }
    
}