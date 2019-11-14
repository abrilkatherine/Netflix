package ada.septima.back.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class UserStorage {

    ObjectMapper objectMapper;

    public UserStorage(ObjectMapper objectMappper){
        this.objectMapper=objectMappper;
    }
}
