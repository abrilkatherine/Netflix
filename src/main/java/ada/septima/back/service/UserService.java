package ada.septima.back.service;

import ada.septima.back.model.ContenidoUnitario;
import ada.septima.back.model.Content;
import ada.septima.back.model.Usuario;
import org.springframework.stereotype.Service;
import ada.septima.back.persistence.ContentStorage;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private Usuario user;
    private ContentStorage contentStorage;
    private List<Content> contentList;

    public List<Content> contentsWatched(){
        List <ContenidoUnitario> listaDeContenidoUnitario = user.getContenidoUnitarioVisto();
        return  listaDeContenidoUnitario.stream().map(contenido -> contenidoToContent(contenido)).collect(Collectors.toList());

    }

    public Content addContents(Content newContent) {
        contentList = contentStorage.readContent();
        contentList.add(newContent);
        return newContent;

    }

    private Content contenidoToContent(ContenidoUnitario contenidoUnitario){
        Content contentNew;
        return contentNew = new Content(contenidoUnitario.getId(), contenidoUnitario.getNombre(), contenidoUnitario.getAño(), contenidoUnitario.getDuracion(), contenidoUnitario.getGenero(), contenidoUnitario.getDirector(), contenidoUnitario.getActores(), null, null, null, null);

    }
}