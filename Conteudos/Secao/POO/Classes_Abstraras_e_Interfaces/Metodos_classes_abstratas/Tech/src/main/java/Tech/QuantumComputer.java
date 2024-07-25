package Tech;

public abstract class QuantumComputer extends ComputerDevice {
  public QuantumComputer(String brand, double storageCapacity) {
    super(brand, storageCapacity);
  }
// teste
  public abstract void quantumComputation();
}
