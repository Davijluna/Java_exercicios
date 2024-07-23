package Tech;

public class Application {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Samsung", 100, 14);
    PowerBank powerBank = new PowerBank();
//    Desktop desktop = new Desktop("Dell", 500);

    plugDevice(laptop);
    plugDevice(powerBank);

//checkDevice(laptop)
//checkDevice(desktop)
  }

  public static void plugDevice(Chargeable chargeable) {
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }
}
