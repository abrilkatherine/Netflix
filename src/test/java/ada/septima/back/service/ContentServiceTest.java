package ada.septima.back.service;

import ada.septima.back.persistence.ContentStorage;
import ada.septima.back.persistence.RestClientStorage;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ContentServiceTest {

    ContentStorage contentStorage = mock(ContentStorage.class);
    RestClientStorage restClientStorage = mock(RestClientStorage.class);
    ContentService contentService = new ContentService(contentStorage, restClientStorage);
    Content titanic = new Content(123, "titanic", 1997, 145, "drama", "pepe", null);
    List<Content> contentFromJson = new ArrayList();

    @Test
    public void contentsTest(){
        contentFromJson.add(titanic)
        when(contentStorage.readContent());
        contentService.content("titanic");

    }
}
