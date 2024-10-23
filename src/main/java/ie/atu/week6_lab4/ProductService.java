package ie.atu.week6_lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> mylist = new ArrayList<>();
    public List<Product> addProduct(Product product) {
        mylist.add(product);
        return mylist;
    }
    public List<Product> getProduct() {
        return mylist;
    }
}
