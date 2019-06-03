import java.util.ArrayList;
import java.util.List;

public class RepositorioDeContenido {

    //vamos a hardcodear tod0 ¯\_(ツ)_/¯
    
    
    public static String genero = "romance";
    
    //no entiendo como funciona esto, lo googlee
    public static List<String> actores = new ArrayList<String>(){
        {
            add("pepita");
            add("pepota");
            add("fulanita");
            add("mengano");
            add("cosme");
            add("fulanito");
            add("pepe");
            add("pedro");
            add("maria");
            add("mario");
            add("adabel");
        }
    };
    
    public static Capitulo capitulo1 = new Capitulo("Capitulo 1",actores, 20,genero);
    public static Capitulo capitulo2 = new Capitulo("Capitulo 2",actores, 20,genero);
    public static Capitulo capitulo3 = new Capitulo("Capitulo 3",actores, 20,genero);
    public static Capitulo capitulo4 = new Capitulo("Capitulo 4",actores, 20,genero);
    public static Capitulo capitulo5 = new Capitulo("Capitulo 5",actores, 20,genero);
    public static Capitulo capitulo6 = new Capitulo("Capitulo 6",actores, 20,genero);
    public static Capitulo capitulo7 = new Capitulo("Capitulo 7",actores, 20,genero);
    public static Capitulo capitulo8 = new Capitulo("Capitulo 8",actores, 20,genero);
    public static Capitulo capitulo9 = new Capitulo("Capitulo 9",actores, 20,genero);
    public static Capitulo capitulo10 = new Capitulo("Capitulo 10",actores, 20,genero);
    public static Capitulo capitulo11 = new Capitulo("Capitulo 11",actores, 20,genero);
    public static Capitulo capitulo12 = new Capitulo("Capitulo 12",actores, 20,genero);
    public static Capitulo capitulo13 = new Capitulo("Capitulo 13",actores, 20,genero);
    
    public static List<Capitulo> capitulos = new ArrayList<Capitulo>(){
        {
            add(capitulo1);
            add(capitulo2);
            add(capitulo3);
            add(capitulo4);
            add(capitulo5);
            add(capitulo6);
            add(capitulo7);
            add(capitulo8);
            add(capitulo9);
            add(capitulo10);
            add(capitulo11);
            add(capitulo12);
            add(capitulo13);
        }
    };
    
    
    
    public static Temporada temporada1 = new Temporada("Temporada1",genero,capitulos);
    public static Temporada temporada2 = new Temporada("Temporada1",genero,capitulos);
    public static Temporada temporada3 = new Temporada("Temporada1",genero,capitulos);
    public static Temporada temporada4 = new Temporada("Temporada1",genero,capitulos);

    public static List<Temporada> temporadas = new ArrayList<Temporada>(){
        {
            add(temporada1);
            add(temporada2);
            add(temporada3);
            add(temporada4);
        }
    };


    public static Serie serieCualquiera = new Serie("cosas raras",genero,temporadas);

    public static Pelicula peliculaCualquiera = new Pelicula("Terminator II",actores, 120,genero);
    



}
