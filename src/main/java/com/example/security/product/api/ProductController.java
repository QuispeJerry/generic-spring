package com.example.security.product.api;

import com.example.security.product.domain.entity.Product;
import com.example.security.product.service.ProductServiceImpl;
import com.example.security.shared.api.BaseControllerImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl> {
}
