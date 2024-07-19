package televisao;

/**
 *
 * @author davi
 */
public class Application {
    
    public static void main(String[] args) {
        
        double sizeCm = Television.convertToCentimeters(32);
        System.out.println("O tamanho em centímetros é: " + sizeCm);
        
        System.out.println("Iniciando o sistema ...");
        
        Television television = new Television("Phillips","LCD", 32);
                
//        television.volume = 100;
//        television.volume = -1;

        System.out.println("A televisão está ligada?");
        System.out.println(television.isOn());
        
        television.setModel("LCD-Ultra");
        
        System.out.println("O volume atual é:");
        System.out.println(television.getVolume());
        
        television.turnOn();
        television.turnOff();
        System.out.println(television.info());
        
        System.out.println("Finalizando sistema ...");
    }
    
}
