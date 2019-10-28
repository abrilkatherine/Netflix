package controller;

import model.Content;
import Service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;
    private ContentController(ContentService contentService){
    this.contentService= contentService;
    }

    @GetMapping("/content")
    public List<Content>content(String title){
            return contentService.contents(title);
    }
    public List<Content>contents(@RequestParam(value="genre", required= false)String genre){
        return contentService.contents(genre);
   }
}
