package com.example.demo.product;

import com.example.demo.common.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // 저장
    @PostMapping("/products")
    public ResponseEntity<BaseResponse> productForm(@RequestBody ProductDto.Register create) {
        productService.register(create);

        Map<String, Object> map = new HashMap<>();
        map.put("msg", "상품 등록 성공");
        return ResponseEntity.ok().body(BaseResponse.success(map));
    }

    // 단건 조회
    @GetMapping("/products")
    public ResponseEntity<BaseResponse> getProduct(Integer id) {
        ProductDto.Product findProduct = productService.read(id);

        return ResponseEntity.ok().body(BaseResponse.success(findProduct));
    }

    // 전체 조회
    @GetMapping("/products/list")
    public ResponseEntity<BaseResponse> getProducts() {
        List<ProductDto.Product> findProducts =  productService.list();

        return ResponseEntity.ok().body(BaseResponse.success(findProducts));
    }
}
