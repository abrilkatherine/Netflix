package service;
import model.Content;
import org.springframework.stereotype.Service;
import persistence.ContentStorage;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private List<Content> contentList;

    private ContentStorage contentStorage;

    public UserService(ContentStorage contentStorage) {
        this.contentStorage = contentStorage;
    }

    public List<Content> contents(String genre) {
        contentList = contentStorage.readContent();
        if (genre == null) {
            return contentList;
        } else {
            return contentList.stream().filter(
                    contentUnidad -> contentUnidad.getGenre().equals(genre))
                    .collect(Collectors.toList());
        }
    }

}
