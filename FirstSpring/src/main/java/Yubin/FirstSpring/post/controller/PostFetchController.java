package Yubin.FirstSpring.post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostFetchController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getPosts(@RequestParam(name = "page", required = false, defaultValue = "1") Long page) {
        return "posts";
    }

    @GetMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public String getPost(@PathVariable long postId) {
        return "certain post";
    }
}
