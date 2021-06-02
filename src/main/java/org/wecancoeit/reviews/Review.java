package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String type;
    private String url;
    private String category;
    private String players;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getCategory() {
        return category;
    }

    public String getPlayers() {
        return players;
    }

    public Review(long id, String type, String url, String category, String players) {

        this.id = id;
        this.type = type;
        this.url = url;
        this.category = category;
        this.players = players;

    }


}
