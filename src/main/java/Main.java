public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Lourdes");

        Contenido contenido = RepositorioDeContenido.peliculaCualquiera;


        Serie serieCosasRaras = RepositorioDeContenido.serieCosasRaras;

        Temporada temporada1DeLaSerieCosasRaras = serieCosasRaras.getTemporadas().get(0);

        Capitulo capitulo1 = temporada1DeLaSerieCosasRaras.getCapitulos().get(0);

        usuario.mirar(capitulo1);

        usuario.mirar(RepositorioDeContenido.peliculaCualquiera);
        System.out.println(usuario.vioContenidoCompleto(contenido));

        System.out.println(RepositorioDeContenido.serieCosasRaras.getDuracion());
    }
}
