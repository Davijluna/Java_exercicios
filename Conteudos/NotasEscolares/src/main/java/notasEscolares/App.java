package notasEscolares;

import java.util.Scanner;


/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    int quant;
    float percentual = 0;
    float total = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String atividades = scanner.nextLine();

    int numAtiv = Integer.parseInt(atividades);

    for (quant = 1; quant <= numAtiv; quant += 1) {
      System.out.println("Digite o nome da atividade " + quant + ":");
      String nomeAtiv = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + quant + ":");
      String pesoAtiv = scanner.nextLine();

      int intPeso = Integer.parseInt(pesoAtiv);

      System.out.println("Digite a nota obtida para " + nomeAtiv);
      String nota = scanner.nextLine();

      float intNota = Integer.parseInt(nota);

      total += intPeso;
      System.out.println(nota);
      percentual += (intPeso * intNota / 100);
    }

    if (total != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
    if (percentual >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + percentual + "%! E temos o prazer de "
          + "informar que você obteve aprovação! ");
    }
    if (percentual < 85.0) {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste"
          + " período, " + percentual + "%, você não atingiu a pontuação mínima necessária"
          + " para sua aprovação.");
    }
  }
}
