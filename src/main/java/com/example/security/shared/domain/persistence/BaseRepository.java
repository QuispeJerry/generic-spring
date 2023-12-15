package com.example.security.shared.domain.persistence;

import com.example.security.shared.domain.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E, ID extends Serializable> extends JpaRepository<E, ID> {
}
