package com.example.security.shared.service;

import com.example.security.shared.domain.entity.Base;
import com.example.security.shared.domain.persistence.BaseRepository;
import com.example.security.shared.domain.service.crud;
import com.example.security.shared.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class crudImpl<T, ID extends Serializable> implements crud<T, ID> {

    protected BaseRepository<T, ID> baseRepository;

    /*protected abstract JpaRepository<T, ID> getRepository();*/

    public crudImpl(BaseRepository<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Transactional(readOnly = true)
    public List<T> getAll() {
        return baseRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<T> getById(ID id) throws Exception {
        try {
            return baseRepository.findById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Transactional
    public T update(T entity, ID id) {
        return baseRepository.save(entity);
    }

    @Transactional
    public boolean deleteById(ID id) {
        if (baseRepository.existsById(id)) {
            baseRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}