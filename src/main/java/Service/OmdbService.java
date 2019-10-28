package Service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OmdbService {

    public String restTemplate() {
       RestTemplate restTemplate = new RestTemplate();
       String fooResourceUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=a6c7f00c";
       return restTemplate.getForEntity(fooResourceUrl +"/1", String.class).getBody();

    }
}