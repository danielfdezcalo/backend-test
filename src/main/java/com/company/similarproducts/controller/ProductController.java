// Expone el endpoint y delega al servicio

package com.company.similarproducts.controller;

import com.company.similarproducts.model.Product;
import com.company.similarproducts.service.SimilarProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final SimilarProductService service;

    public ProductController(SimilarProductService service) {
        this.service = service;
    }

    @GetMapping("/{id}/similar")
    public List<Product> getSimilarProducts(@PathVariable String id) {
        return service.getSimilarProducts(id);
    }
}