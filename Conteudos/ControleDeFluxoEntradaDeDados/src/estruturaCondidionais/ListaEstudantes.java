package estruturaCondidionais;


public class ListaEstudantes {
    
    public static void main(String[] args) {
        
        String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
        String log;
        
        int totalAlunos = alunos.length;
        
        log = "Lista de chamada possui " + totalAlunos + "alunos\n";
        
        int matricula;
        
        for(int posicao = 0; posicao < totalAlunos; posicao++) {
            matricula = posicao + 1;
            log = "Matriculas: " + posicao + " Alunos: " + alunos[posicao] + "\n";
            System.out.println(log);
        }
        
        
   }
    
}
