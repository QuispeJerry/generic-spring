package com.example.security.shared.domain.api;

import com.example.security.shared.domain.entity.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseController <E, ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable ID id);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
