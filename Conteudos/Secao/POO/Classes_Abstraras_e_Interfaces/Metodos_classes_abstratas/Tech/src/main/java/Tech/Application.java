package Tech;

public class Application {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Samsung", 100, 14);
    Desktop desktop = new Desktop("Dell", 500);

    plugDevice(laptop);
    plugDevice(powerBank);

//    checkDevice(desktop);
//    laptop.bootUp();
  }

  public static void plugDevice(ComputerDevice chargeable) {
    System.out.println("Verificando dispositivo de marca " + chargeable.getBrand());
    chargeable.bootUp();
  }
}
