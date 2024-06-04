package Yubin.FirstSpring.post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostDeleteController {

    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public String deletePost(@PathVariable("postId") long postId) {
        return "post deleted";
    }
}
