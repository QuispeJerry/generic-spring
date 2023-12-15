package com.example.security.store.domain.persistence;

import com.example.security.shared.domain.persistence.BaseRepository;
import com.example.security.store.domain.entity.Store;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends BaseRepository<Store, Long> {
}
