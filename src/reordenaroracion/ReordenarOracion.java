
package reordenaroracion;

import static reordenaroracion.Reordenar.reordenarOracion;

public class ReordenarOracion {

    public static void main(String[] args) {
        String[] palabras = {"hola2", "que1", "tal3"};

        String resultado = reordenarOracion(palabras);
        
        System.out.println(resultado);  
    }
    
}
