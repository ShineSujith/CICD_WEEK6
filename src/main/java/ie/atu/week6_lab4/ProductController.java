package ie.atu.week6_lab4;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private List<Product> myList = new ArrayList<>();
    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody Product product){
        myList = myProduct.addProduct(product);
        //logic to add new product to database

        //return list of products
        return myList;
    }
}
