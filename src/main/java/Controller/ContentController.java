package Controller;

import Model.ContenidoUnitario;
import Service.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {
    private ContentService contentService;
    private ContentController(ContentService contentService){
    this.contentService= contentService;

    }

    @GetMapping("/content")
    public List<ContenidoUnitario>content{
        @RequestParam(value="title",required = false) String title){
            return contentService.content(title);
        }
    }
}
