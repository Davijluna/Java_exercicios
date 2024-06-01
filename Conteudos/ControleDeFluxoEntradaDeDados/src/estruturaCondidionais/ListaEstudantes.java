package estruturaCondidionais;


/*

                    DUAS FORMAS DE INSTÂCIAR UM ARRAY.

Primeira forma
String[] arrayDeEstudantes = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };


Segunda forma
int[] arrayDeInteiros = new int[9];
arrayDeInteiros[0] = 0;
arrayDeInteiros[1] = 1;
//...
arrayDeInteiros[8] = 8;

*/


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
