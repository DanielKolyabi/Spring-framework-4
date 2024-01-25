package ro.shum.foodProducts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class ShoppingListController {
  private final ShoppingListService shoppingListService;

  public ShoppingListController(ShoppingListService shoppingListService) {
    this.shoppingListService = shoppingListService;
  }

  @GetMapping
  public ResponseEntity<List<Food>> getAllFoods() {
    return new ResponseEntity<>(shoppingListService.getAllFoods(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Void> addFood(@RequestBody Food food) {
    shoppingListService.addFood(food);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Food> getFoodById(@PathVariable int id) {
    Food food = shoppingListService.getFoodById(id);
    if (food == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(food, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteFood(@PathVariable int id) {
    shoppingListService.deleteFood(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}