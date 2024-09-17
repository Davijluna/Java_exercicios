package Collection.OperacaoemList;

import java.util.Arrays;
import java.util.List;
public class SistemaEscolar {
  public static void main(String[] args) {
    List<String> estudante = Arrays.asList("João","Maria","Pedro","Rosa");
    System.out.println(estudante);
  }

}

// O código acima é o mesmo que digitar
//List<String> estudantes = Arrays.asList(new String[]{"João","Maria","Pedro","Rosa"});