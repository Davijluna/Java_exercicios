package conta;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */

public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String contaNumber = Integer.toString(literalAccountNumber);
    // `leftPad` e `right`
    if (contaNumber.length() < 6) {
      return String.format("%6s", contaNumber).replace(" ", "0");
    }
    if (contaNumber.length() > 6) {
      return StringUtils.right(contaNumber, 6);
    }
    return contaNumber;
  }

}