package Controller;

import Model.Content;
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
    public List<Content>content(String title){
            return contentService.contents(title);
    }


}


