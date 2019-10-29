package Service;

import model.Contenido;
import model.Content;
import model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private Usuario user;

    public List<Content> contentsWatched(){
        List <Contenido>  listaDeContenido = user.getContenidoVisto();
        return  listaDeContenido.stream().map(contenido -> contenidoToContent(contenido)).collect(Collectors.toList());

    }

    private Content contenidoToContent(Contenido contenido){
        Content contentNew;
        return contentNew = new Content(contenido.getId(), contenido.getNombre(), contenido.getAño(), contenido.getDuracion(), contenido.getGenero(), contenido.getDirector(), contenido.getActores(), null, null, null, null);

    }
}
