package pl.akademiakodu.model;

public class Gif {

    private boolean favorite;
    private String name;
    private String userName;

    public Gif(boolean favorite, String name, String userName) {
        this.favorite = favorite;
        this.name = name;
        this.userName = userName;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }
}