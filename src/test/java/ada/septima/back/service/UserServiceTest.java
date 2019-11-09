package ada.septima.back.service;

import ada.septima.back.model.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    private Usuario personita;
    private String willy;
    private ContenidoUnitario titanic = new Pelicula(123, "titanic",1997, null, 120, "drama", "cameron");
    private ContenidoUnitario matrix = mock(Pelicula.class);
    private List<ContenidoUnitario> contenidoUnitarioList;
    private List<ContenidoGeneral> contenidoGeneralList;


    public void setUp(){
        personita= new Usuario("willy");
        contenidoUnitarioList = new ArrayList<>();
        contenidoGeneralList = new ArrayList<>();
    }

    @Test
    public void contenidoVisto() {
        this.setUp();
        contenidoUnitarioList.add(titanic);
        personita.setContenidoUnitarioVisto(contenidoUnitarioList);
        assertTrue(personita.visteEsteContenidoCompleto(titanic));
    }

      @Test
      public void mirar() {
        this.setUp();
        personita.mirar(titanic);
        assertTrue(personita.getContenidoVistoCompleto().contains(titanic));
        }

}




