import java.util.ArrayList;
import java.util.List;

public class Exercicio {
  public static void main(String[] args) {
    List<Integer>  numeros = new ArrayList<>();
    numeros.add(3);
    numeros.add(4);
    numeros.add(8);
    numeros.add(17);
    numeros.add(32);

//    System.out.println(numeros);
    List<Integer> pares = new ArrayList<>();
    for (Integer numero : numeros) {
      if (numero % 2 == 0) {
        pares.add(numero);
      }

    }
    System.out.println(pares);
  }

}
