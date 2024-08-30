
package reordenaroracion;

public class Reordenar {
      public static String reordenarOracion(String[] palabras) {
          
        String[] reordenado = new String[palabras.length];

        for (String palabra : palabras) {
            int i = palabra.length() - 1;
            while (i >= 0 && Character.isDigit(palabra.charAt(i))) {
                i--;
            }

            String numero = palabra.substring(i + 1);
            String palabraSinNumero = palabra.substring(0, i + 1);

            int indice = Integer.parseInt(numero);

            reordenado[indice - 1] = palabraSinNumero;
        }

        StringBuilder resultado = new StringBuilder();
        for (String palabra : reordenado) {
            if (resultado.length() > 0) {
                resultado.append(" ");
            }
            resultado.append(palabra);
        }

        return resultado.toString();
    }
}
