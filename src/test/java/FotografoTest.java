import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FotografoTest {

    @Test
    void calculaSalario() {
        Fotografo fotografo = new Fotografo();
        fotografo.setNome("Vinicius");
        fotografo.setIdade(33);
        fotografo.setHorasTrabalhadas(6.0f);
        fotografo.setSalarioHora(200.0f);
        fotografo.setValorfoto(2.0f);
        fotografo.setNumFotos(150);
        assertEquals("Vinicius", fotografo.getNome());
        assertEquals(33, fotografo.getIdade());
        assertEquals(1500, fotografo.calculaSalario());
    }
}