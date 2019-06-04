public class Main {

    public static void main(String[] args) {

        //punto 1

        Usuario usuario = new Usuario("Lourdes");

        Contenido contenido = RepositorioDeContenido.peliculaCualquiera;


        Serie serieCosasRaras = RepositorioDeContenido.serieCosasRaras;

        Temporada temporada1DeLaSerieCosasRaras = serieCosasRaras.getTemporadas().get(0);

        Capitulo capitulo1 = temporada1DeLaSerieCosasRaras.getCapitulos().get(0);

        usuario.mirar(capitulo1);

        //usuario.mirar(RepositorioDeContenido.temporada1.getCapitulos().get(0));
        usuario.mirar(RepositorioDeContenido.peliculaCualquiera);
        Sistema sistema = new Sistema();
        System.out.println(sistema.vioElContenidoCompleto(contenido,usuario));

        //punto 2
        System.out.println(RepositorioDeContenido.serieCosasRaras.getDuracion());
        //TODO ARREGLAR QUE SERIE Y TEMPORADA TENGAN GENERO PORQUE ES EL MISMO QUE EL GENERO QUE TIENEN LOS CAPITULOS

    }
}
