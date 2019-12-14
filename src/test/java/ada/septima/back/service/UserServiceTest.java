package ada.septima.back.service;

import ada.septima.back.model.*;
import ada.septima.back.persistence.ContentStorage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    private Usuario personita = new Usuario("personita");
    private List<ContenidoUnitario> contenidoUnitarioList = new ArrayList<>();
    private List<String> responseExpected = Arrays.asList("titanic", "el origen");
    private Pelicula titanic = new Pelicula(14, "titanic", 1997, null, null, null, null, "plot");
    private Pelicula elOrigen = new Pelicula(13, "el origen", 2009, null, null, null, null, "plot");
    private UserService service = new UserService();
    private List<Content> contentList = new ArrayList<>();
    private Content content = mock(Content.class);
    private ContentStorage contentStorage =  mock(ContentStorage.class);



    public void SetUp(){
        service.setUser(personita);
        contenidoUnitarioList.add(titanic);
        contenidoUnitarioList.add(elOrigen);
        personita.setContenidoUnitarioVisto(contenidoUnitarioList);


    }

    @Test
    public void contentsWatchedTest(){
        this.SetUp();
        service.contentsWatched().stream().map(Response::getTitle).
                allMatch(titulo-> responseExpected.contains(titulo));

    }

    @Test
    public void addContents(){
        when(contentStorage.readContent());
        service.setContentList(contentList);
        service.addContents(content);
        service.getContentList().contains(content);
    }


}
