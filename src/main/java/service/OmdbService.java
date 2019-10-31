package service;
import model.Content;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OmdbService {

    public Content restTemplate(String contentId) {
       RestTemplate restTemplate = new RestTemplate();
       //tt3896198
       String fooResourceUrl = "http://www.omdbapi.com/?i="+contentId+"&apikey=a6c7f00c";
       return restTemplate.getForObject(fooResourceUrl, Content.class);

    }
}