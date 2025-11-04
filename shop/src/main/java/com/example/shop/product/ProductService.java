package com.example.shop.product;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepsitory productRepsitory) {
        this.productRepository = productRepsitory;
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        Product product = productRepository.findById(id);

        if ( product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다. ");

        }

        return product;

    }

    public Product updateProduct(Long id, Product updatedProduct){
        Product product = getProductById(id);
        product.setName(updatedProduct.getName());
        product.setPrice(updateProduct.getPrice());
        product.setDescription(updatedProduct.getDescription());
        return productRepository.save(product);
    }
    public void deleteMember(Long id) {
        productRepository.deleteById(id);
    }
}
