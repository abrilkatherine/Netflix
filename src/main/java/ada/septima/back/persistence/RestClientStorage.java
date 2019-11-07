package ada.septima.back.persistence;

import ada.septima.back.model.Content;
import ada.septima.back.model.ContentOmdb;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class RestClientStorage {

    String title;
    String contentId;
    ObjectMapper objectMapper;

    public ContentOmdb omdbResponsePorTitlo(String title){
        try {
            RestTemplate restTemplate = new RestTemplate();
            final String uri= "http://www.omdbapi.com/?i="+contentId+"&apikey=a6c7f00c="+title.toLowerCase();
            String json = restTemplate.getForObject(uri,String.class);
            ContentOmdb contentOmdb = objectMapper.readValue(json,ContentOmdb.class);
            return contentOmdb;
        }

        catch (IOException ioe){
            throw new RuntimeException("Problema con la serializacion",ioe);
        }
    }
}