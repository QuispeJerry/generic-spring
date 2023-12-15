package com.example.security.store.service;

import com.example.security.shared.domain.persistence.BaseRepository;
import com.example.security.shared.service.crudImpl;
import com.example.security.store.domain.entity.Store;
import com.example.security.store.domain.persistence.StoreRepository;
import com.example.security.store.domain.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl extends crudImpl<Store, Long> implements StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public StoreServiceImpl(BaseRepository<Store, Long> baseRepository){
        super(baseRepository);
    }
}
