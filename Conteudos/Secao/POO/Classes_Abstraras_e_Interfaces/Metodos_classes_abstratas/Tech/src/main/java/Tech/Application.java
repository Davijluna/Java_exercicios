package Tech;

public class Application {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Samsung", 100, 14);
    PowerBank powerBank = new PowerBank();
//    Desktop desktop = new Desktop("Dell", 500);
    ComputerDevice genericDevice = new Laptop("Apple", 256.0, 13.3);



    plugDevice(laptop);
    plugDevice(powerBank);

    if (genericDevice instanceof Laptop) {
      Laptop specificLaptop = (Laptop) genericDevice;
    }

//checkDevice(laptop)
//checkDevice(desktop)
  }

  public static void plugDevice(Chargeable chargeable) {
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }

}
