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


    List<String> nomes = new ArrayList<>();
    nomes.add("davi");
    nomes.add("natalha");
    nomes.add("mauro");

//    System.out.println(numeros);

//    Filtrando os nomes.
    List<String> caixaAlta = new ArrayList<>();

    int total = numeros.stream().mapToInt(Integer::intValue).sum();

    for (String nome : nomes) {
       caixaAlta.add(nome.toUpperCase());
    }
    System.out.println(caixaAlta);
//    filtrando os números.
    List<Integer> pares = new ArrayList<>();
    for (Integer numero : numeros) {
      if (numero % 2 == 0) {
        pares.add(numero);
      }
    }

    System.out.println(pares);
    System.out.println(total);
  }

}
