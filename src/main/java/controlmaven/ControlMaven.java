package controlmaven;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlMaven {

    public static void main(String[] args) {
        try {
            Metodos.recogerMostrarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ControlMaven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
