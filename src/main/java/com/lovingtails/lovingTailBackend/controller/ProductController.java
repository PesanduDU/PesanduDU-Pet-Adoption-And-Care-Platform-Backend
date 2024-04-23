package com.lovingtails.lovingTailBackend.controller;

import com.lovingtails.lovingTailBackend.dto.ProductDTO;
import com.lovingtails.lovingTailBackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProducts")
    public List<ProductDTO> getProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProductByID/{id}")
    public ProductDTO getProductByID(@PathVariable String id){
        return productService.getProductByID(id);
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@RequestBody ProductDTO productDTO){

        return productService.saveProduct(productDTO);
    }
}
