package ada.septima.back.service;

import ada.septima.back.model.ContenidoUnitario;
import ada.septima.back.model.Content;
import ada.septima.back.model.Response;
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

    public List<Response> contentsWatched(){
        List <ContenidoUnitario> listaDeContenidoUnitario = getUser().getContenidoUnitarioVisto();
        return  listaDeContenidoUnitario.stream().map(contenido -> contenidoToResponse(contenido)).collect(Collectors.toList());

    }

    public Content addContents(Content newContent) {
        contentList = contentStorage.readContent();
        contentList.add(newContent);
        return newContent;

    }

    private Response contenidoToResponse(ContenidoUnitario contenidoUnitario){
        Response responseNew;
        return responseNew = new Response(contenidoUnitario.getId(), contenidoUnitario.getNombre(), contenidoUnitario.getAño(),
                contenidoUnitario.getDuracion(), contenidoUnitario.getGenero(), contenidoUnitario.getDirector(),
                contenidoUnitario.getActores());

    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}