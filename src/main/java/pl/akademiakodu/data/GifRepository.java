package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;

<<<<<<< HEAD
import java.awt.*;
import java.lang.reflect.Array;
=======
>>>>>>> 21be5d076a429ed0f47302adc64a97b97d33942f
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
<<<<<<< HEAD
            new Gif(true, "android-explosion", "Agata"),
            new Gif(true, "ben-and-mike", "Ola"),
            new Gif(false, "compiler-bot", "Zosia"),
            new Gif(true, "infinite-andrew", "Karol")
=======
            new Gif(true, "android-explosion", "Agata", 3),
            new Gif(true, "ben-and-mike", "Ola", 1),
            new Gif(false, "compiler-bot", "Zosia", 2),
            new Gif(true, "infinite-andrew", "Karol",2)
>>>>>>> 21be5d076a429ed0f47302adc64a97b97d33942f
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
<<<<<<< HEAD
            if (gif.isFavorite()) {
=======
            if(gif.isFavorite()) {
>>>>>>> 21be5d076a429ed0f47302adc64a97b97d33942f
                return new ArrayList<>(ALL_GIFS);
            }
        }
        return ALL_GIFS;
    }
}
//
//    public List<Gif> getFavorites() {
//        List<Gif> favoritesGifs = new ArrayList<>();
//
//        for (Gif gif : ALL_GIFS) {
//            if (gif.getFavorite()) {
//                favoritesGifs.add(gif);
//            }
//        }
//        return favoritesGifs;
//    }
<<<<<<< HEAD



=======
>>>>>>> 21be5d076a429ed0f47302adc64a97b97d33942f
