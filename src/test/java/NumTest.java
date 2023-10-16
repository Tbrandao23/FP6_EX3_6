import org.example.Numero;
import org.example.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumTest {
    @Test
    public void testNum() {
        Numero num1 = new Numero();
        int num = num1.contaDigitos(31);
        int testNum = 2;

        assertEquals (num, testNum, "Erro no calculo da media dos Digitos !");

    }
}
