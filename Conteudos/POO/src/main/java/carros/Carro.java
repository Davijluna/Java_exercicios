package carros;

/**
 *
 * @author davi
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private static int contador = 0;
    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        Carro.contador++;
    }
    
    public void exibirInformacoes() {
        System.out.printf("Marca: %s, Modelo: %s, Ano: %d%n",
                marca, modelo, ano);
    }
    
    public void main(String[] args) {
        Carro carro = new Carro("Hyundai", "HB20", 2022);
        carro.exibirInformacoes();
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public static int quantidadeDeCarros() {
        return contador;
    }
    
}
