package ada.septima.back.controller;
import ada.septima.back.model.Content;
import ada.septima.back.service.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {

    private ContentService contentService;
    public ContentController(ContentService contentService){
    this.contentService= contentService;
    }

    @GetMapping("/content")
    public List<Content> content(@RequestParam(value = "title", required = false) String title){
            return contentService.contents(title);
   }
}
