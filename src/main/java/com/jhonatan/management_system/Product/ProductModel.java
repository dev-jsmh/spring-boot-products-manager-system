
package com.jhonatan.management_system.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * Jhonatan Samuel Martinez Hernandez 
 * Ficha 2675859 Análisis y Desarrollo De Software 
 * Aprendiz SENA 
 * Año 2024
 *
 */

// clase modelo para crear instancias de nuevos productos y manipular su información
@Entity
@Table(name="products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id generado por la base de datos
    public String name; // nombre del producto 
    private String model; // modelo del producto 
    private double purchase_price; // precio de compra 
    private double sale_price; // precio de venta a publico
    private int stock; // unidades disponibles
    private String description; // descripción del producto o detalles relevantes
    
    // creo un contructor con alguno datos relevantes por defecto 
    public ProductModel(String name, String model, double purchase_price, double sale_price, int stock, String description){
        this.name = name;
        this.model = model;
        this.purchase_price = purchase_price;
        this.sale_price = sale_price;
        this.stock = stock;
        this.description = description;
    }
    
    // crea contructor basio
    public ProductModel(){ }
// =========== setters and getters of the class ===========
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
