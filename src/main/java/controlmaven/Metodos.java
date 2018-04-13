package controlmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

public class Metodos {
    
    public static void recogerMostrarDatos() throws IOException{
        String url = "https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP";
        Document document = Jsoup.connect(url).get();
        
        String temperatura = document.select(".today_nowcard-temp").text();
        String estadoTiempo = document.select(".today_nowcard-phrase").text();
        String titulo = document.select("title").text();
        
        System.out.println("Hoy esta "+estadoTiempo+" y hace "+temperatura+". Datos extraidos de "+titulo);
    }

}
