import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    List<String> nome = new ArrayList<>();

    nome.add("Maria");
    nome.add("Paulo");
    nome.add("Davi");
    nome.add("Gustavo");

    List<String> nomesFiltrados = new ArrayList<>();

    for (String nomes : nome) {
        if (nomes.startsWith("D")) {
          nomesFiltrados.add(nomes);
        }
    }

    for (String nomeFiltrados : nomesFiltrados) {
      System.out.println(nomeFiltrados);
    }

  }

}
