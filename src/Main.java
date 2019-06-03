import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //punto 1
        Usuario usuario = new Usuario("Lourdes");
        Contenido contenido = RepositorioDeContenido.peliculaCualquiera;
        usuario.mirar(RepositorioDeContenido.peliculaCualquiera);
        System.out.println(Sistema.visteEsteContenidoCompleto(contenido,usuario));

        //punto 2
        System.out.println(RepositorioDeContenido.serieCualquiera.getDuracion());
        //TODO ARREGLAR QUE SERIE Y TEMPORADA TENGAN GENERO PORQUE ES EL MISMO QUE EL GENERO QUE TIENEN LOS CAPITULOS

    }
}
