import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void testaCalculoDoSalarioDeUmProfessor(){
        Professor professor = new Professor();
        professor.setNome("Leonardo");
        professor.setIdade(45);
        professor.setNumDiasAulas(12);
        professor.setSalarioHora(1000.0f);
        professor.setHorasTrabalhadas(2);
        assertEquals("Leonardo", professor.getNome());
        assertEquals(45, professor.getIdade());
        assertEquals(24000, professor.calculaSalario());
    }

}