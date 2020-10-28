public class Parser_Ecuacion {


    public int obtenerParte1(final String ecuacion) {
        String[] partes1 = obtenerPartes12(ecuacion);
        String parte1 = partes1[0].trim();//elimina los espacion en blanco en ambos extremos del string

        return Integer.valueOf(parte1.substring(0, parte1.length() - 1));
    }

    public int obtenerParte2(final String ecuacion)
    {
        String[]partes1= obtenerPartes12(ecuacion);
        String parte2= partes1[1].trim();
        String operador= obtenerOperador(ecuacion);

        if("-".equals(operador))
        {
            return Integer.valueOf(parte2)*(-1);

        }
     return  Integer.valueOf(parte2);
    }
public String obtenerOperador(final String ecuacion)
{
 if (ecuacion.indexOf('+')>0) {
     return "+";
 }else{
     return "-";

 }

}

public int obtenerParte3(final String ecuacion)
{
    String[] partesEcuacion = ecuacion.split("=");//split divide un string en substrings
    return Integer.valueOf(partesEcuacion[1].trim());

}
    private String[] obtenerPartes12(final String ecuacion) {
        String[] partesEcuacion = ecuacion.split("=");

        String operador = obtenerOperador(ecuacion);

        String[] partes1 = partesEcuacion[0].split("//" + operador);

        return partes1;
    }
    }

