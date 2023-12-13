package com.example.security.product.domain.entity;

import com.example.security.shared.domain.entity.Base;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
public class Product extends Base {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Float price;
}
