package com.example.demo.product;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void register(ProductDto.Register dto){
        productRepository.save(dto.toEntity());
    }

    public List<ProductDto.Product> list(){
        List<ProductTT> result = productRepository.findAll();
        return result.stream().map(ProductDto.Product::from).toList();
    }

    public  ProductDto.Product read(Integer idx){
        Optional<ProductTT> result = productRepository.findById(idx);

        if (result.isPresent()){
            ProductTT entity = result.get();

            return ProductDto.Product.from(entity);
        }

        return null;
    }
}


