package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif(true, "android-explosion", "Agata"),
            new Gif(true, "ben-and-mike", "Ola"),
            new Gif(false, "compiler-bot", "Zosia"),
            new Gif(true, "infinite-andrew", "Karol")
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> getFavorites() {
        for (Gif gif : ALL_GIFS) {
            if(gif.isFavorite()) {
                return new ArrayList<>(ALL_GIFS);
            }
        }
        return ALL_GIFS;
    }
}