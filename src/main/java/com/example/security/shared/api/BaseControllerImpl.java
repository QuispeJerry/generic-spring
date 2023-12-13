package com.example.security.shared.api;

import com.example.security.shared.domain.api.BaseController;
import com.example.security.shared.domain.entity.Base;
import com.example.security.shared.service.crudImpl;
import io.swagger.v3.core.util.ReferenceTypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


abstract public class BaseControllerImpl<E extends Base, S extends crudImpl<E, Long>> implements BaseController<E,Long> {
    @Autowired
    protected S service;

    @Override
    @GetMapping
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable Long s) {
        try {
            if (s.equals(entity.getId())){
                return ResponseEntity.status(HttpStatus.CREATED).body(service.update(entity, s));
            }
            return ResponseEntity.status(HttpStatus.CONFLICT).body("el id no coincide con el Id del objeto");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.deleteById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
