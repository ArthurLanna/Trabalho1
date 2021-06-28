import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void verificaAprovacaoComAs2PrimeirasNotas() {
        Aluno aluno = new Aluno();
        aluno.setNome("Arthur");
        aluno.setIdade(20);
        aluno.setMatricula("201965113AC");
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        assertEquals("Arthur", aluno.getNome());
        assertEquals(20, aluno.getIdade());
        assertEquals("201965113AC", aluno.getMatricula());
        assertEquals(true, aluno.verificaAprovacao());
    }

    @Test
    void verificaAprovacaoComANotaFinal(){
        Aluno aluno = new Aluno();
        aluno.setNome("Junior");
        aluno.setIdade(21);
        aluno.setMatricula("1654961");
        aluno.setNota1(6.0f);
        aluno.setNota2(5.9f);
        aluno.setNotaFinal(6.05f);
        assertEquals("Junior", aluno.getNome());
        assertEquals(21, aluno.getIdade());
        assertEquals("1654961", aluno.getMatricula());
        assertEquals(true, aluno.verificaAprovacao());
    }

    @Test
    void verificaReprovacao(){
        Aluno aluno = new Aluno();
        aluno.setNome("Brofu");
        aluno.setIdade(20);
        aluno.setMatricula("6516541981");
        aluno.setNota1(6.0f);
        aluno.setNota2(5.9f);
        aluno.setNotaFinal(6.04f);
        assertEquals("Brofu", aluno.getNome());
        assertEquals(20, aluno.getIdade());
        assertEquals("6516541981", aluno.getMatricula());
        assertEquals(false, aluno.verificaAprovacao());
    }
}