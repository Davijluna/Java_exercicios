import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Exercicio {
  public static void main(String[] args) {

//    List<Integer> total = new ArrayList<>();

    List<Integer>  numeros = new ArrayList<>();
    numeros.add(3);
    numeros.add(4);
    numeros.add(8);
    numeros.add(17);
    numeros.add(32);


    List<String> nomes = List.of("davi", "mara");

//   Total de números
    int total = numeros.stream().mapToInt(Integer::intValue).sum();



    System.out.println(total);
    System.out.println(nomes.);
  }

}
