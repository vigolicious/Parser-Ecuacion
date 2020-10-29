

public class EcuacionPrimerGrado {

    private Parser_Ecuacion parser = new Parser_Ecuacion();

    public double obtenerResultado(final String ecuacion) {
        int parte1 = parser.obtenerParte1(ecuacion);
        int parte2 = parser.obtenerParte2(ecuacion);
        int parte3 = parser.obtenerParte3(ecuacion);
        double resultado = Double.valueOf((parte3 - parte2)) / Double.valueOf(parte1);
        return resultado;
    }


}
