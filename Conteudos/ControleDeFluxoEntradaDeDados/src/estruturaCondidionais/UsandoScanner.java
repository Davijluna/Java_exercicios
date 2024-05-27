package estruturaCondidionais;

import java.util.Scanner;


public class UsandoScanner  {
    public static void main(String[] args) {
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Qual o sue nome: ");
//        String nome = scanner.next();
//        System.out.println("Boas-vindas " + nome + "!" );
//        scanner.close();
        
        
//        CONVERTENDO STRING EM NUMEROS

//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Entre com o primeiro número: ");
//    String input1 = scanner.next();
//    System.out.print("Entre com o segundo número: ");
//    String input2 = scanner.next();
//
//    int n1 = Integer.parseInt(input1);
//    int n2 = Integer.parseInt(input2);
//
//    int resultado = n1 + n2;
//    System.out.println("O resultado da soma é: " + resultado);


//      IMPRIMINTO OLÂ COM SCANNER 

        Scanner scanner = new Scanner(System.in);

        String hello = "Olá"; // Novo objeto do tipo String instanciado.
        System.out.println("Diga Olá: ");
        String input = scanner.next(); // Novo objeto do tipo String instanciado.

        // Objetos diferentes, mesmo que com o mesmo valor serão tratados como diferentes pelo comparador ==.
        if (hello == input) { 
            System.out.println("Isso não será impresso.");
        } 

        if (hello != input) {
            System.out.println("Isso será impresso.");
        } 

        if (hello == hello) {
            System.out.println("Isso também será impresso, é o mesmo objeto.");
}

// Verifica se o conteúdo armazenado em ambos os objetos é o mesmo através do método equals.
        if (hello.equals(input)) {
        System.out.println("Isso pode ser impresso se Olá for inserido em nosso terminal.");
}
        
    }
}
