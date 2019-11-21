package ada.septima.back.service;

import ada.septima.back.model.ContenidoUnitario;
import ada.septima.back.model.Pelicula;
import ada.septima.back.model.Response;
import ada.septima.back.model.Usuario;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

public class UserServiceTest {
    private Usuario personita = new Usuario("personita");
    private List<ContenidoUnitario> contenidoUnitarioList = new ArrayList<>();
    private List<String> responseExpected = Arrays.asList("titanic", "el origen");
    private Pelicula titanic = new Pelicula(14, "titanic", 1997, null, null, null, null);
    private Pelicula elOrigen = new Pelicula(13, "el origen", 2009, null, null, null, null);
    private UserService service = new UserService();


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


}
