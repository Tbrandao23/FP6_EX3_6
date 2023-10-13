import org.example.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    @Test
    public void testSoma() {
        Retangulo ret1 = new Retangulo(3,5);
        Retangulo ret2 = new Retangulo(5,8);
        Retangulo ret3 = new Retangulo(2,4);
        int area1 = ret1.area(ret1);
        int testarea1 = 15;
        int area2 = ret2.area(ret2);
        int testarea2 = 40;
        int area3 = ret3.area(ret3);
        int testarea3 = 8;
        assertEquals (area1, testarea1, "Erro no calculo da Area !");
        assertEquals (area2, testarea2, "Erro no calculo da Area !");
        assertEquals (area3, testarea3, "Erro no calculo da Area !");
    }

}
