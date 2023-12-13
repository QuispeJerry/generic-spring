package com.example.security.product.domain.persistence;

import com.example.security.product.domain.entity.Product;
import com.example.security.shared.domain.persistence.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {
}
