package ro.shum.foodProducts;

import lombok.Data;

@Data
public class Product {
  private Long id;
  private String name;
  private String category;

  public Product(Long id, String name, String category) {
    this.id = id;
    this.name = name;
    this.category = category;
  }


}