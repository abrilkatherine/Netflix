package ada.septima.back.persistence;

import ada.septima.back.model.Content;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class ContentStorage {

    @Autowired
    ObjectMapper objectMapper;

    public ContentStorage(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Bean
    public List<Content> readContent() {
        try {
            return objectMapper.readValue
                    (ResourceUtils.getFile("classpath:Content.json"),
                            new TypeReference<List<Content>>() {
                            });
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void writeContent(Content content) {
        try {
            objectMapper.writeValue(new File("src/main/resources/content.json"), content);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

