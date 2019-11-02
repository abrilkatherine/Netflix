package controller;

import model.User;
import org.springframework.web.bind.annotation.*;
import service.ContentService;
import service.UserService;
import model.Content;

import java.util.List;

@RestController
public class UserController {

    public User users;
    private ContentService contentService;


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{user_id}/contents")
    public List<Content> contents(@PathVariable(value = "user_id") Integer userId,
                                  @RequestParam(value = "genre", required = false) String genre) {
        return userService.contentsWatched();
    }

    @PostMapping("/users/{user_id}/watched")
    public Content addContents(@RequestBody Content newContent, @PathVariable(value="user_id")Integer userId) {
        return userService.addContents(newContent);
    }
}
