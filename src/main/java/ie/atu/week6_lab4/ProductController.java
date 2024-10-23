package ie.atu.week6_lab4;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody @Valid Product product){
        return myProduct.addProduct(product);
    }

    @GetMapping("/getProduct")
    public List<Product> allProduct() {
        return myProduct.getProduct();
    }
}
