package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Exercicio {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros);
    Collections.sort(numeros);
    System.out.println(numeros);
  }
}
