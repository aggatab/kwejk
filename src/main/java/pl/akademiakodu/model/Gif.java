package pl.akademiakodu.model;

public class Gif {

    private boolean favorite;
    private String name;
    private String userName;
    private int categoryId;

    public Gif(boolean favorite, String name, String userName, int categoryId) {
        this.favorite = favorite;
        this.name = name;
        this.userName = userName;
        this.categoryId = categoryId;
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

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }
}