package service;

import model.ContenidoUnitario;
import model.Content;
import model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private Usuario user;

    public List<Content> contentsWatched(){
        List <ContenidoUnitario> listaDeContenidoUnitario = user.getContenidoUnitarioVisto();
        return  listaDeContenidoUnitario.stream().map(contenido -> contenidoToContent(contenido)).collect(Collectors.toList());

    }

    private Content contenidoToContent(ContenidoUnitario contenidoUnitario){
        Content contentNew;
        return contentNew = new Content(contenidoUnitario.getId(), contenidoUnitario.getNombre(), contenidoUnitario.getAño(), contenidoUnitario.getDuracion(), contenidoUnitario.getGenero(), contenidoUnitario.getDirector(), contenidoUnitario.getActores(), null, null, null, null);

    }
}