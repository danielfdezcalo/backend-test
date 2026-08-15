// Obtiene el detalle de un producto concreto

package com.company.similarproducts.client;

import com.company.similarproducts.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDetailClient {

    public Product getProduct(String productId) {

        // TODO:
        // Llamada REST a:
        // GET /product/{id}

        return new Product();
    }
}