package controlmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Clase con los metodos del programa.
 * @author ldizbarros
 */
public class Metodos {
    
    /**
     * Este metodo estatico recoge la informacion de la pagina web introducida
     * y muestra por pantalla los datos recogidos.
     * @throws IOException se lanza una excepcion en caso de un error con la conexion a la pagina web
     */
    public static void recogerMostrarDatos() throws IOException{
        String url = "https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP";
        Document document = Jsoup.connect(url).get();
        
        String temperatura = document.select(".today_nowcard-temp").text();
        String estadoTiempo = document.select(".today_nowcard-phrase").text();
        String titulo = document.select("title").text();
        
        System.out.println("Hoy esta "+estadoTiempo+" y hace "+temperatura+". Datos extraidos de "+titulo);
    }

}
