package com.example.security.product.service;

import com.example.security.product.domain.entity.Product;
import com.example.security.product.domain.persistence.ProductRepository;
import com.example.security.shared.domain.persistence.BaseRepository;
import com.example.security.shared.service.crudImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends crudImpl<Product, Long> {
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository){
        super(baseRepository);
    }
}
