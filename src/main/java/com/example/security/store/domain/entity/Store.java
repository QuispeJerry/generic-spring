package com.example.security.store.domain.entity;

import com.example.security.shared.domain.entity.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//error fin
@Entity
@Table(name = "stores")
public class Store extends Base {
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "created_date")
    private Date createdDate;
}
