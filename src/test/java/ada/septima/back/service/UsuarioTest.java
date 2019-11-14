package ada.septima.back.service;
import ada.septima.back.model.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class UsuarioTest {
    private Usuario personita;
    private String willy;
    private ContenidoUnitario titanic = new Pelicula(123, "titanic",1997, null, 120, "drama", "cameron");
    private List<Temporada> temporadas = new ArrayList<>();
    private List<Capitulo> capitulos1;
    private List<Capitulo> capitulos2;
    private Capitulo cap2 = mock(Capitulo.class);
    private Capitulo pilot= mock(Capitulo.class);
    private Capitulo cap3 = mock(Capitulo.class);
    private Capitulo cap4 = mock(Capitulo.class);
    private List<ContenidoUnitario> contenidoUnitarioList;
    private List<ContenidoGeneral> contenidoGeneralList;
    private Temporada temporada1 = new Temporada("temporada 1", "policial", capitulos1);
    private Temporada temporada2 = new Temporada("temporada 2", "policial", capitulos2);
    private Serie breakingBad = new Serie(1234, "Breaking Bad", 2007, "policial", temporadas, null);


    public void setUp(){
        personita= new Usuario("willy");
        contenidoUnitarioList = new ArrayList<>();
        contenidoGeneralList = new ArrayList<>();
        temporadas = new ArrayList<>();
        temporadas.add(temporada1);
        temporadas.add(temporada2);
        capitulos1= new ArrayList<>();
        capitulos1.add(pilot);
        capitulos1.add(cap2);
        capitulos2= new ArrayList<>();
        capitulos2.add(cap3);
        capitulos1.add(cap4);
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

     @Test
    public void vioContenidoCompleto(){
        this.setUp();
        when(pilot.contenidoGeneralDelUnitario()).thenReturn(breakingBad);
         when(cap2.contenidoGeneralDelUnitario()).thenReturn(breakingBad);
         when(cap3.contenidoGeneralDelUnitario()).thenReturn(breakingBad);
         when(cap4.contenidoGeneralDelUnitario()).thenReturn(breakingBad);
        when(pilot.fuisteVistoPor(eq(personita))).thenReturn(true);
         when(cap2.fuisteVistoPor(eq(personita))).thenReturn(true);
         when(cap3.fuisteVistoPor(eq(personita))).thenReturn(true);
         when(cap4.fuisteVistoPor(eq(personita))).thenReturn(true);
        personita.mirar(pilot);
        personita.mirar(cap2);
        personita.mirar(cap3);
        personita.mirar(cap4);
        contenidoUnitarioList.add(pilot);
        contenidoUnitarioList.add(cap2);
        contenidoUnitarioList.add(cap3);
        contenidoUnitarioList.add(cap4);
        personita.setContenidoUnitarioVisto(contenidoUnitarioList);
         assertTrue(personita.vioContenidoCompleto(breakingBad));
     }
}




