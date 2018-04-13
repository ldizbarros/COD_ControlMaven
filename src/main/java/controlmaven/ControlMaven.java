package controlmaven;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Aplicacion Control Maven
 * @author ldizbarros
 */
public class ControlMaven {

    /**
     * Clase principal de la aplicacion.
     * En esta clase se llama a la clase metodos donde esta el codigo principal del programa.
     * @param args 
     */
    public static void main(String[] args) {
        try {
            Metodos.recogerMostrarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ControlMaven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
