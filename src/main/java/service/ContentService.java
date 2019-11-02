package service;

import model.Content;
import model.Usuario;
import org.springframework.stereotype.Service;
import persistence.ContentStorage;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContentService {
    private List<Content> contentList;
    private ContentStorage contentStorage;
    private Usuario user;


    public ContentService(ContentStorage contentStorage) {
        this.contentStorage = contentStorage;
    }

    public List<Content> contents(String title) {
        contentList = contentStorage.readContent();
        if (title == null) {
            return contentList;
        } else {
            return contentList.stream().filter(
                    contentUnidad -> contentUnidad.getTitle().equals(title))
                    .collect(Collectors.toList());
        }
    }
}