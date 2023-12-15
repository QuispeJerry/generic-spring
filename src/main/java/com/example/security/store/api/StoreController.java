package com.example.security.store.api;

import com.example.security.product.domain.entity.Product;
import com.example.security.product.service.ProductServiceImpl;
import com.example.security.shared.api.BaseControllerImpl;
import com.example.security.store.domain.entity.Store;
import com.example.security.store.service.StoreServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "Store")
public class StoreController extends BaseControllerImpl<Store, StoreServiceImpl> {
}
