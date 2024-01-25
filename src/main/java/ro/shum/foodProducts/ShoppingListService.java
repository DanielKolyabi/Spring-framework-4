package ro.shum.foodProducts;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShoppingListService {
  private final ShoppingList shoppingList = new ShoppingList();

  public List<Food> getAllFoods() {
    return shoppingList.getFoods();
  }

  public Food getFoodById(int id) {
    return shoppingList.getFoodById(id);
  }

  public void addFood(Food food) {
    shoppingList.addFood(food);
  }

  public void deleteFood(int id) {
    shoppingList.deleteFood(id);
  }
}