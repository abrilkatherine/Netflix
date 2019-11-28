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
    @Test
    public void contentsTest(){
        when(contentStorage.readContent());


    }
}
