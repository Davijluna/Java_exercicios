package conta;


public class Banco {
    
    public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria(1000);

    conta.mostrarmensagen();
    conta.depositar(500);

    double valorConvertido = conta.convertermoeda(30, 5);
  }
    
    
    
    
}


