package com.lovingtails.lovingTailBackend.service;

import com.lovingtails.lovingTailBackend.dto.ProductDTO;
import com.lovingtails.lovingTailBackend.entity.Product;
import com.lovingtails.lovingTailBackend.repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> getAllProducts(){
        List<Product> products = productRepo.findAll();
        return modelMapper.map(products, new TypeToken<List<ProductDTO>>(){}.getType());
    }

    public ProductDTO getProductByID(String id){
        Product product = productRepo.getProductByID(id);
        return modelMapper.map(product, ProductDTO.class);
    }

    public String saveProduct(ProductDTO productDTO){
        productRepo.save(modelMapper.map(productDTO,Product.class));
        return "Product Saved!";
    }

}
