package Debugging.src.Aula2;

public class ContaBancaria {
  void mostraMensagem() {
    System.out.println("Conta bancária acessada.");
  }

  void depositar(double valor) {
    System.out.println("Valor depositado: ");
    System.out.println(valor);
  }

  double converteMoeda(float total,float cambio) {
    return total * cambio;
  }
}


public class Banco {
  public static void main(string[] args) {
    ContaBancaria conta = new ContaBancaria();
  }
}