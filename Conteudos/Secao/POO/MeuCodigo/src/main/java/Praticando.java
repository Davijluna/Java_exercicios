import java.util.ArrayList;
import java.util.List;


public class Praticando {
  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);
    numeros.add(7);
    int soma = 0;
    double media;

    List<Integer> quadradosPares = new ArrayList<>();

//    percorro a lista de números e faço a soma ao próximo.
    for (Integer numero : numeros) {
      soma += numero;
    }
    media = (double) soma / numeros.size();
    for (Integer numero : numeros) {
      if (numero % 2 == 0) {
        quadradosPares.add(numero * numero);
      }
    }
    quadradosPares.forEach(System.out::println);
    System.out.println(soma);
    System.out.println(media);
  }
}
