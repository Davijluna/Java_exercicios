package Collection.OperacaoemMap;

import java.util.HashMap;
public class SistemaEscolar {

  public static void main(String[] args) {
    HashMap <String, String> estudante = new HashMap<String, String>();
    estudante.put("x098735", "Paulo");
    estudante.put("x987444", "Mara");
    estudante.put("x009811", "Leonardo");
    System.out.println(estudante);
    String valorAnterior = estudante.put("x098735", "Ana");// Mesma matricula usada no mapeamento com Paulo
    System.out.println("valor anterior x098735: " +valorAnterior);
    System.out.println("Estudantes: " +estudante);

//    Agora, quando precisamos ler o valor associado a uma chave, usamos o get(K):

    System.out.println(estudante.get("x987444"));

//    Map também possui as mesmas funções de List e Set para verificar tamanho: isEmpty() e size().
//    Essas funções são importantes, especialmente quando estamos varrendo os itens do Map.
//
//        Para remover um mapeamento do mapa, basta chamar o remove(Object),
//        passando a chave como parâmetro:

    estudante.remove("x987444");
    System.out.println(estudante);
  }

}
