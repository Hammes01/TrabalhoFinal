package Main;

import static org.junit.jupiter.api.Assertions.*;

class AlunosTest {

    @org.junit.jupiter.api.Test
    void testmediafinal() {
        Alunos aluno1 = new Alunos("Vitor");
        aluno1.notastrab("trab1", 6, 4);
        aluno1.notaspro("prova1",10, 6);
        assertEquals(8.4,aluno1.mediafinal());
    }
}