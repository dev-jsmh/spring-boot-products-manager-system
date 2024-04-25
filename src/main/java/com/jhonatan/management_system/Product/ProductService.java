package com.jhonatan.management_system.Product;

import org.springframework.stereotype.Service;

//Jhonatan Samuel Martinez Hernandez 
//Ficha 2675859 
//Análisis y Desarrollo De Software 
//Aprendiz SENA
//Año 2024
//
// clase para manejar la logica de negocio relacionanda a los productos
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public ProductModel getProductById(Long id) {
        // get the product from data base using the repository layer
        return this.productRepository.findById(id).get();
    }

}
