package conta;


public class ContaBancaria {
    // Este é um atrubuto.
    double saldo = 0;
    
//  construtor
     public ContaBancaria(double saldo) {
        this.saldo = saldo;
  }
    
    void mostrarmensagen() {
        System.out.println("Conta Bancária acessada");
        System.out.println(saldo);
    }
    
    void depositar(double valor) {
        this.saldo += valor;
    }
    
    double convertermoeda(float total, float cambio){
        return total * cambio;
    }   
}



