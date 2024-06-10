package conta;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o número da conta:");
    String numberConta = scanner.next();

    if (!StringUtils.isNumericSpace(numberConta)) {
      System.out.println("Número da conta inválido!");
    }
    if (StringUtils.isNumericSpace(numberConta)) {
      AccountNumberFormatter myNumber = new AccountNumberFormatter();
      int conta = Integer.parseInt(numberConta);
      System.out.println("Número da conta: " + myNumber.formatAccountNumber(conta));
    }
    scanner.close();
  }

}