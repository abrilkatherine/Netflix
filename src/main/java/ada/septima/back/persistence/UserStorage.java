package ada.septima.back.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserStorage {

    @Autowired
    ObjectMapper objectMapper;

    public UserStorage(ObjectMapper objectMappper){
        this.objectMapper=objectMappper;
    }
}
