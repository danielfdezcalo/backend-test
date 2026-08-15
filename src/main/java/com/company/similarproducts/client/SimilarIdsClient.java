// llama al servicio externo

package com.company.similarproducts.client;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimilarIdsClient {

    public List<String> getSimilarProductIds(String productId) {

        // TODO:
        // Llamada REST a:
        // GET /product/{id}/similarids

        return List.of();
    }
}