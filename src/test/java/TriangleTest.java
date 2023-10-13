import org.example.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testTriangle() {
        Retangulo ret = new Retangulo();
        boolean val = ret.isTriangle(1,2,3);
        boolean testVal = false;
        assertEquals (val, testVal, "Erro no calculo se é um Triangulo !");

    }
}
