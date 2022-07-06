package Main;

public class Main {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Vitor");
        Disciplina matematica = new Disciplina("matematica");
        matematica.notastrab("trab1", 9, 2);
        matematica.notaspro("prova1",10, 8);
        System.out.println(aluno1.nome+"|"+matematica.nome+" = Media final: "+matematica.mediafinal());
    }
}