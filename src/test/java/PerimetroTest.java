import org.example.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimetroTest {
    @Test
    public void testPer() {
        Retangulo ret1 = new Retangulo(3,5);
        Retangulo ret2 = new Retangulo(5,8);
        Retangulo ret3 = new Retangulo(2,4);
        int per1 = ret1.perimetro(ret1);
        int testPer1 = 16;
        int per2 = ret2.perimetro(ret2);
        int testPer2 = 26;
        int per3 = ret3.perimetro(ret3);
        int testPer3 = 12;
        assertEquals (per1, testPer1, "Erro no calculo da Area !");
        assertEquals (per2, testPer2, "Erro no calculo da Area !");
        assertEquals (per3, testPer3, "Erro no calculo da Area !");
    }
}
