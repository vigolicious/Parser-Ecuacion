package src.main.java;

public class EcuacionPrimerGrado {

    private Parser_Ecuacion parseador = new Parser_Ecuacion();
    public double obtenerResultado(final String ecuacion) {
        int parte1 = parseador.obtenerParte1(ecuacion);
        int parte2 = parseador.obtenerParte2(ecuacion);
        int parte3 = parseador.obtenerParte3(ecuacion);
        double resultado = Double.valueOf((parte3 - parte2)) / Double.valueOf(parte1);
        return resultado;
    }
}


