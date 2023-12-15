package com.example.security.product.api;

import com.example.security.product.domain.entity.Product;
import com.example.security.product.service.ProductServiceImpl;
import com.example.security.shared.api.BaseControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@RestController
@CrossOrigin("*")
@RequestMapping(path = "products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl> {
}*/


@RestController
@CrossOrigin("*")
@RequestMapping(path = "products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl> {
    /*@Autowired
    private ProductServiceImpl productService;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping
    public List<Product> getAll() {return productService.getAll();}

    @GetMapping("{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id).get();
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> update (@PathVariable Long id, @RequestBody Product product){
        if (id.equals(product.getId())){
            productService.update(product,id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id){
        if (productService.deleteById(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/
}