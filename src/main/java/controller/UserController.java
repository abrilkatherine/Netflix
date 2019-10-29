package controller;

import Service.UserService;
import model.Content;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;
    private UserController(UserService userService){
        this.userService= userService;
    }

    @GetMapping("/Users/user_id/watched")
    public List<Content> contentsWatched(){
        return userService.contentsWatched();
    }
}
