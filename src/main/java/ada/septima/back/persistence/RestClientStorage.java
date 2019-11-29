package ada.septima.back.persistence;

import ada.septima.back.model.Content;
import ada.septima.back.model.ContentOmdb;
import ada.septima.back.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class RestClientStorage {

    String title;
    String contentId;
    ObjectMapper objectMapper;

    public ContentOmdb omdbResponsePorTitulo(String title){
        try {
            RestTemplate restTemplate = new RestTemplate();
            final String uri= "http://www.omdbapi.com/?&apikey=a6c7f00c&t="+title.toLowerCase();
            String json = restTemplate.getForObject(uri,String.class);
            ContentOmdb contentOmdb = objectMapper.readValue(json,ContentOmdb.class);
            return contentOmdb;
        }

        catch (IOException ioe){
            throw new RuntimeException("Problema con la serializacion",ioe);
        }
    }
}