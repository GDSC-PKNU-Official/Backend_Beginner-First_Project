package Yubin.FirstSpring.post.controller;

public class GetPostRequest {
    private String title;
    private String content;
    private Long id;

    public GetPostRequest() {
    }

    public GetPostRequest(String title, String content, Long id) {
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
    this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
