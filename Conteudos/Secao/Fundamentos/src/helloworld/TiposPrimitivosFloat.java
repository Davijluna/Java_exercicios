package helloworld;


/*
No Java, é necessário adicionar a letra f no final do número para indicar que 
ele é do tipo float. O motivo é que a precisão entre float 
e double são diferentes. Se não inserirmos a letra f, o Java entenderá que você
está tentando atribuir um valor do tipo double a uma variável do tipo float.
*/

public class TiposPrimitivosFloat {
    
    public static void main(String[] args) {
        float numA = -101.23f;
        float numB =  2.356f;
        
        System.out.println(numA + numB);
    }
    
}
