package ada.septima.back.service;

import ada.septima.back.model.Content;
import ada.septima.back.model.ContentOmdb;
import ada.septima.back.model.Response;
import ada.septima.back.model.Usuario;
import ada.septima.back.persistence.RestClientStorage;
import org.springframework.stereotype.Service;
import ada.septima.back.persistence.ContentStorage;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContentService {
    private Response response;
    private ContentStorage contentStorage;
    private RestClientStorage restClientStorage;

    public ContentService(ContentStorage contentStorage,
                          RestClientStorage restClientStorage) {
        this.contentStorage = contentStorage;
        this.restClientStorage = restClientStorage;
    }

    public Response contents(String title) {
        List<Content> contentsFromJson = contentStorage.readContent();
        Content contentFiltered = contentsFromJson.stream().filter(
                contentUnidad -> contentUnidad.getTitle().equals(title))
                .findFirst().get(); //Revisar que pasa cuando viene vacìo

        return contenToResponse(contentFiltered, restClientStorage.omdbResponsePorTitlo(title));
    }

    private Response contenToResponse(Content content, ContentOmdb contentOmdb){
        Response newResponse;
        return newResponse= new Response(content.getId(),content.getTitle(),content.getYear(),content.getDuration(),content.getGenre(),content.getDirector(),content.getActor(),contentOmdb.getPlot());
    }
}