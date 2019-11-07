package ada.septima.back.service;
import ada.septima.back.model.Content;
import ada.septima.back.model.Response;
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

    private Response contenToResponse(Content content){
        Response newResponse;
        return newResponse= new Response(content.getId(),content.getTitle(),content.getYear(),content.getDuration(),content.getGenre(),content.getDirector(),content.getActor(),content.getPlot());
    }
}