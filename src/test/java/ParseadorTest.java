import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ParseadorTest {

    private final Parser_Ecuacion parseador = new Parser_Ecuacion();

    @Test
    public void obtenerParte1Unidades() throws Exception {
        String ecuacion = "2x - 1 = 0";

        int resultado = parseador.obtenerParte1(ecuacion);

        Assertions.assertEquals(2, resultado);
    }

    @Test
    public void obtenerParte2Suma() throws Exception {
        String ecuacion = "2x + 1 = 0";

        int resultado = parseador.obtenerParte2(ecuacion);

        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void obtenerParte3Positivo() throws Exception {
        String ecuacion = "2x + 1 = 3";

        int resultado = parseador.obtenerParte3(ecuacion);

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void obtenerOperadorSuma() throws Exception {
        String ecuacion = "2x + 1 = 0";

        String operador = parseador.obtenerOperador(ecuacion);

        Assertions.assertEquals("+", operador);
    }

}