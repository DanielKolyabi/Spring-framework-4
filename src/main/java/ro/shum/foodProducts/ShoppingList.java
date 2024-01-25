package ro.shum.foodProducts;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

  private List<Food> foods;
  private int idCounter = 0;

  public ShoppingList() {
    this.foods = new ArrayList<>();
  }

  public void addFood(Food food) {
    food.setId((long) idCounter++);
    foods.add(food);
  }

  public void removeFood(Food food) {
    foods.remove(food);
  }

  public List<Food> getFoods() {
    return new ArrayList<>(foods);
  }

  public Food getFoodById(int id) {
    for (Food food : foods) {
      if (food.getId() == id) {
        return food;
      }
    }
    return null;
  }

  public void deleteFood(int id) {
    foods.removeIf(food -> food.getId() == id);
  }
}
