package Main;

public class Disciplina {
    public String nome;
    Notas notas = new Notas();
    public Disciplina(String Disciplina) {
        this.nome = Disciplina;
    }
    public void notastrab (String nome, double nota, double peso){
        this.notas.addtrab(nome, nota, peso);
    }
    public void notaspro (String nome, double nota, double peso){
        this.notas.addpro(nome, nota, peso);
    }
    public double mediafinal() {
        return notas.calnotapeso()/notas.somapeso();
    }
}
