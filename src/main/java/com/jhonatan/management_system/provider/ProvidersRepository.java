/**
 *
 * Jhonatan Samuel Martinez Hernandez 
 * Ficha 2675859 
 * Análisis y Desarrollo De Software 
 * Aprendiz SENA 
 * Año 2024
 *
 */
package com.jhonatan.management_system.provider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// repository interface that allows me to performe operations on data base tables
@Repository
public interface ProvidersRepository extends JpaRepository<ProvidersModel, Long> {
    
}

/**
 *
 * Jhonatan Samuel Martinez Hernandez 
 * Ficha 2675859 
 * Análisis y Desarrollo De Software 
 * Aprendiz SENA 
 * Año 2024
 *
 */