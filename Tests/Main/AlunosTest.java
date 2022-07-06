package Main;

import static org.junit.jupiter.api.Assertions.*;

class AlunosTest {

    @org.junit.jupiter.api.Test
    void testmediafinal() {
        Alunos aluno1 = new Alunos("Vitor");
        Disciplina matematica = new Disciplina("matematica");
        matematica.notastrab("trab1", 9, 2);
        matematica.notaspro("prova1",10, 8);
        assertEquals(9.8,matematica.mediafinal());
    }

}