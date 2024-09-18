package Collection.OperacaoemList;

import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;
public class SistemaEscolar {
//  public static void main(String[] args) {
//    List<String> estudante = Arrays.asList("João","Maria","Pedro","Rosa");
//    System.out.println(estudante);
//  }

//  para recuperar um elemento da lista pelo seu índice, usamos o "get(int"

//  public static void main(String[] args) {
//    List <String> estudante = List.of("João","Maria","Pedro","Rosa");
//    String estudanteDoIndice2 = estudante.get(2);
//    System.out.println(estudanteDoIndice2);
//  }



// O código acima é o mesmo que digitar
//List<String> estudantes = Arrays.asList(new String[]{"João","Maria","Pedro","Rosa"});
//ou mesmo
//  String[]arrayDeEstudantes = new String[]{"João","Maria","Pedro","Rosa"};
//  List<String> estudantes = Arrays.asList(arrayDeEstudantes);

//Outra forma ainda mais simples de se criar listas, com a ressalva de que são imutáveis,
// é utilizando a sintaxe que estreou no Java 9:

//  List<String> estudantes = List.of("João","Maria","Pedro","Rosa");


//   ESSA MODIFICAÇÃO RESULTARIA EM UM ERRO.para isso funcionar poderiamos usar o método Arrays.asList
//  public static void main(String[] args){
//    List<String> estudantes = List.of("João","Maria","Pedro","Rosa");
//    estudantes.set(0,"Joana");
//  }

// PARA ISSO FUNCIONAR
//public static void main(String[] args){
//  List<String> estudantes = Arrays.asList("João","Maria","Pedro","Rosa");
//  estudantes.set(0,"Joana");
//}

// se quisermos adicionar Joana a lista

//  public static void main(String[] args) {
//    ArrayList<String> estudantes = new ArrayList<String>(
//        Arrays.asList("João", "Maria", "Pedro", "Rosa"));
//    estudantes.add("Joana");
//    System.out.println(estudantes);
//  }


//  PARA REMOVER PODEMOS FAZER UMA REMOÇÃO POR INDICE PELO PROPRIO ELEMENTO

//  public static void main(String[] args) {
//    ArrayList<String> estudantes = new ArrayList<String>(Arrays.asList("João","Maria","Pedro","Rosa"));
//    estudantes.remove(1);
//    System.out.println(estudantes);
//    estudantes.remove("Pedro");
//    System.out.println(estudantes);
//  }


//  VERIFICANDO TAMANHO ATUAL ATRAVÉS DO MÉTODO

//  public static void main(String[] args) {
//
//    List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
//    System.out.println(estudantes.size());
//  }

//  Assim como verificar com o contains(T) se um item pertence atualmente àquela instância:

  public static void main(String[] args) {
    List<String> estudantes = Arrays.asList("João","Maria","Pedro","Rosa");
    System.out.println(estudantes.contains("Rosa"));
  }

}

// Link da docunentação : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html