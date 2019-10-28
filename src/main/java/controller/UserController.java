package controller;

import Service.UserService;
import model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    private UserController(UserService userService){
        this.userService= userService;
    }

    @GetMapping("/user_id/contents")
    public List<Content> contents(@RequestParam(value="genre", required= false)String genre) {
        return contentService.contents(genre);

    }
}
