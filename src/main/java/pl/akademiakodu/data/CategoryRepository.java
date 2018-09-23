package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Category;

import java.util.Arrays;
import java.util.List;

@Component //umożliwia autopowiązania springowe
public class CategoryRepository {

    public static final List<Category>ALL_CATEGORIES = Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "sport"),
            new Category(3, "it")
    );

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

   public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}