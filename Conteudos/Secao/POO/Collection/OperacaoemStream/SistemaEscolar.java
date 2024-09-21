package Collection.OperacaoemStream;

import java.util.
public class SistemaEscolar {
  public class Estudante {

    private String matricula;

    private String nome;

    private String curso;

    public Estudante() {
    }

    public Estudante(String matricula, String nome, String curso) {
      this.matricula = matricula;
      this.nome = nome;
      this.curso = curso;
    }
    // GETs e SETs
  }

  public class CodeExamples {

    public static Collection<Estudante> obterEntrada() {
      return Set.of(
          new Estudante("2001", "Maria", "Computação"),
          new Estudante("2002", "João", "Computação"),
          new Estudante("2003", "José", "Pedagogia"),
          new Estudante("2004", "Ana", "Computação"),
          new Estudante("2005", "Bernardo", "Engenharia"),
          new Estudante("2006", "Antônia", "Computação"));
    }

    public static void main(String[] args) {
      Collection<Estudante> entrada = obterEntrada();
      List<String> matriculas = entrada.stream()
          .filter(e -> "Computação".equals(e.getCurso()))
          .sorted(Comparator.comparing(Estudante::getNome))
          .map(Estudante::getMatricula)
          .toList();
      System.out.println(matriculas);
    }

  }
}
