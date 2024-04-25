
package com.jhonatan.management_system.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * Jhonatan Samuel Martinez Hernandez 
 * Ficha 2675859 Análisis y Desarrollo De Software 
 * Aprendiz SENA 
 * Año 2024
 *
 */

// capa que nos permite acceder y manipular información de la base de datos
// relacionada a los productos
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{
    
}
