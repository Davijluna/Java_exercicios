package Collection.OperacaoemStream;

import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.Comparator;

  class Estudante {

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

    public String getNome() {
      return nome;
    }

    public String getCurso() {
      return curso;
    }

    public String getMatricula() {
      return matricula;
    }
    // GETs e SETs
  }

  public class Estudantes {

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

