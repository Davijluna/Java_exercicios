package Collection.OperacaoemSet;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class SistemaEscolar {

//  public static void main(String[] args) {
//    LinkedHashSet<String> estudantes = new LinkedHashSet<>();
//    estudantes.add("João");
//    estudantes.add("Maria");
//
//    // Mostra a lista de estudantes com "João" e "Maria"
//    System.out.println(estudantes);  // Saída: [João, Maria]
//
//    // Remove "João"
//    estudantes.remove("João");
//
//    // Mostra a lista após a remoção de "João"
//    System.out.println(estudantes);  // Saída: [Maria]
//  }
//}

//  public static void main(String[] args) {
//    HashSet<String> estudantes = new HashSet<>();
//    estudantes.add("João");
//    estudantes.add("Maria");
//    System.out.println(estudantes.size());
//  }
//
//}


  public static void main(String[] args) {
    HashSet<String> estudantes = new HashSet<>();
    estudantes.add("João");
    estudantes.add("Maria");
    System.out.println(estudantes.contains("Maria"));
  }

}

//  public static void main(String[] args) {
//    HashSet<String> estudantes = new HashSet<>();
//    boolean adicionouJoao = estudantes.add("João");
//    boolean adicionouJoaoDeNovo = estudantes.add("João");
//    boolean adicionouMaria = estudantes.add("Maria");
//
//    System.out.println("adicionouJoao: " + adicionouJoao);  // true
//    System.out.println("adicionouJoaoDeNovo: " + adicionouJoaoDeNovo);  // false
//    System.out.println("adicionouMaria: " + adicionouMaria);  // true
//  }
//}
//    private String matricula;
//
//    private String nome;
//
//    public boolean equals(Object obj) {
//      if (this == obj)
//        return true;
//      if (obj == null)
//        return false;
//      if (getClass() != obj.getClass())
//        return false;
//      SistemaEscolar other = (SistemaEscolar) obj;
//      if (matricula == null) {
//        if (other.matricula != null)
//          return false;
//      } else if (!matricula.equals(other.matricula))
//        return false;
//      return true;
//    }



