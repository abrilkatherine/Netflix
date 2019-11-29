package ada.septima.back.service;

import ada.septima.back.model.Content;
import ada.septima.back.model.ContentOmdb;
import ada.septima.back.model.Response;
import ada.septima.back.model.Usuario;
import ada.septima.back.persistence.RestClientStorage;
import org.springframework.stereotype.Service;
import ada.septima.back.persistence.ContentStorage;

import java.util.List;
import java.util.Optional;
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

    public List<Response> contents(String title) {
        List<Content> contentsFromJson = contentStorage.readContent();
        if (title==null){
            return contentsFromJson.stream().map(content -> content.contentToResponse()).collect(Collectors.toList());
            /*cuando esta vacia, devolver toda la lista.
             Mapear para que devuelva la lista de response*/
        }else{
        List<Content> contentFiltered = contentsFromJson.stream().filter(
                contentUnidad -> contentUnidad.getTitle().equals(title)).collect(Collectors.toList());
        return contentFiltered.stream().map(content -> content.contentToResponse()).collect(Collectors.toList());
    }

    }
    private Response contentOmdbToResponse(Content content, ContentOmdb contentOmdb){

        Response newResponse = new Response(
                content.getId(),
                content.getTitle(),
                content.getYear(),content.getDuration(),
                content.getGenre(),content.getDirector(),content.getActor());
        return newResponse;
    }
}