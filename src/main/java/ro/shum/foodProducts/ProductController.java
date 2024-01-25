package ro.shum.foodProducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @GetMapping
  public String listProducts(Model model) {
    model.addAttribute("products", productService.getAllProducts());
    return "products";
  }

  @GetMapping("/{id}")
  public String getProduct(@PathVariable Long id, Model model) {
    model.addAttribute("product", productService.getProductByID(id));
    return "productProfile";
  }
}