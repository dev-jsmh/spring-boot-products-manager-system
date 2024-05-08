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

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="providers")
public class ProvidersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String address;

    // =========== empty constructor ===========
    public ProvidersModel() {}
    
    // =========== constructor with values ===========
    public ProvidersModel(
            String name,
            String phone,
            String address
    ) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // =========== Getters for the model ===========
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    // =========== Setters for the model ===========
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
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
