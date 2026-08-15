// Implementa la lógica principal

package com.company.similarproducts.service;

import com.company.similarproducts.client.ProductDetailClient;
import com.company.similarproducts.client.SimilarIdsClient;
import com.company.similarproducts.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SimilarProductService {

    private final SimilarIdsClient similarIdsClient;
    private final ProductDetailClient productDetailClient;

    public SimilarProductService(
            SimilarIdsClient similarIdsClient,
            ProductDetailClient productDetailClient) {

        this.similarIdsClient = similarIdsClient;
        this.productDetailClient = productDetailClient;
    }

    public List<Product> getSimilarProducts(String id) {

        List<String> similarIds =
                similarIdsClient.getSimilarProductIds(id);

        return similarIds.stream()
                .map(productDetailClient::getProduct)
                .collect(Collectors.toList());
    }
}