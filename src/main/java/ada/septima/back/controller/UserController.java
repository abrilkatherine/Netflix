package ada.septima.back.controller;

import ada.septima.back.model.Response;
import ada.septima.back.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ada.septima.back.service.ContentService;
import ada.septima.back.service.UserService;
import ada.septima.back.model.Content;

import java.util.List;

@RestController
public class UserController {

    private ContentService contentService;

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{user_id}/contents")
    public List<Response> contents(@PathVariable(value = "user_id") Integer userId,
                                   @RequestParam(value = "genre", required = false) String genre) {
        return userService.contentsWatched();
    }

    @PostMapping("/users/{user_id}/watched")
    public Content addContents(@RequestBody Content newContent, @PathVariable(value="user_id")Integer userId) {
        return userService.addContents(newContent);
    }
}
