import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// Convertemos para uma solução com Streem.
public class PrincipalStreem {
  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();

    nomes.add("Maria");
    nomes.add("Paulo");
    nomes.add("Davi");
    nomes.add("Gustavo");
    nomes.add("Mara");

    List<String> nomesFiltrados = nomes.stream().filter(nome ->
            nome.startsWith("M"))
            .map(String::toUpperCase)
            .toList();


    nomesFiltrados.forEach(System.out::println);
//        new ArrayList<>();
//
//    for (String nomes : nome) {
//      if (nomes.startsWith("D")) {
//        nomesFiltrados.add(nomes);
//      }
//    }

    for (String nomeFiltrados : nomesFiltrados) {
      System.out.println(nomeFiltrados);
    }

  }

}
