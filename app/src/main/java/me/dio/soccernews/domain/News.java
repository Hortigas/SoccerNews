package me.dio.soccernews.domain;

public class News {
    private Integer id;
    private String title;
    private String description;
    private String image;
    private String link;

    public News(Integer id, String title, String description, String image, String link) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
