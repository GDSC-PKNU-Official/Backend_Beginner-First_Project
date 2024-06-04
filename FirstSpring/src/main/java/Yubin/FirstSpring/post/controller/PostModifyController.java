package Yubin.FirstSpring.post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostModifyController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addPost(@RequestBody GetPostRequest getPostRequest) {
        return "post added";
    }

    @PutMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public String updatePost(@PathVariable("postId") long postId, @RequestBody GetPostRequest request) {
        return "post updated";
    }
}
