package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Autowired
public class OmdbService {

    private static boolean OmdbService()
    {
        final String uri = "http://www.omdbapi.com/?i=tt3896198&apikey=a6c7f00c";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return restTemplate.getForObject();
    }
}