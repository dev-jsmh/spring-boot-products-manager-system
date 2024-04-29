package com.jhonatan.management_system.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * Jhonatan Samuel Martinez Hernandez Ficha 2675859 Análisis y Desarrollo De
 * Software Aprendiz SENA Año 2024
 *
 */
@Controller()
@RequestMapping("/products")
public class ProductController {
    // injecto las dependias para el controlador
    // clase modelo producto 

    private ProductModel productModel;
    // injecto el servicio 
    private ProductService productService;

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    };
   
    
    // ========================== product table view  ==========================
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String product_list(Model model) {
        model.addAttribute("products", this.productRepository.findAll());
        return "products";
    }

    // ========================== Get detail view for products ==========================
    @GetMapping("/{id}/details")
    public String productDetails(
            // get variable form url
            @PathVariable("id") Long id,
            // set the model
            Model model) {
        // call the service layer to find the product in the data base 
        ProductModel desiredProduct = this.productService.getProductById(id);
        // add product as an attribute of the model in order to access the product in the template
        model.addAttribute("product", desiredProduct);

        return "product_details";
    }

    ;
    // ========================== Get create product new products ==========================

    @GetMapping("/create")
    public String createNewProduct(Model model) {
        // create an new instance of the ProductModel
        // add the product as an attribute of the model
        model.addAttribute("product", new ProductModel());
        //  return the form view to create a new product in the data base
        return "createProduct";
    }

    ;
    // ========================== Post save product data to data base ==========================

  @PostMapping("/create")
    public String saveProduct(@ModelAttribute ProductModel newProduct) {
        try {
            // call the repository to save the created product in the data base
            this.productRepository.save(newProduct);
            // return the view
            return "redirect:/products/list";
            // if an exception happends execute the code below
        } catch (Exception ex) {
            throw new RuntimeException("Error saving product instance: .....", ex);
        }

    }

    // ========================== Get modify product view ==========================
    @GetMapping("/{id}/edit")
    // get the product id from the url and pass it alogn side with a model object as parameters
    public String editProductInfo(@PathVariable("id") Long id, Model model) {

        // usamos la clase modelo como parametro y el id del producto
        // buscamos el producto en inventario 
        ProductModel desiredProduct = this.productService.getProductById(id);

        // agregamos la instancia del producto que queremos editar como attributo del modelo
        model.addAttribute("product", desiredProduct);
        // retornamos la vista correspondiente al formulario para editar la información
        return "editProduct";
    }

    // ========================== Post save modifed product method ==========================
    @PostMapping("/{id}/edit")
    // get the product id from the url and pass it alogn side with a model object as parameters
    public String saveEditProductInfo(@PathVariable("id") Long id, @ModelAttribute("product") ProductModel editedProduct) {
        try {
            // get product by its id from data base and store it in a variable 
           ProductModel desiredProduct = this.productRepository.findById(id).get();
           
           // use the product object modified in the form view and set its attributes to 
           // the product previously fetched from data base
           desiredProduct.setName(editedProduct.getName());
           desiredProduct.setModel(editedProduct.getModel());
           desiredProduct.setPurchase_price(editedProduct.getPurchase_price());
           desiredProduct.setSale_price( editedProduct.getSale_price());
           desiredProduct.setStock( editedProduct.getStock());
           desiredProduct.setDescription(editedProduct.getDescription());
            
           // save data of modified product object again to data base
           this.productRepository.save(desiredProduct);

            // retornamos la vista correspondiente al formulario para editar la información
            return "redirect:/products/list";
            // if error happends catch it and show error message
        } catch (Exception ex) {
            throw new RuntimeException("Could not save modify data of product.. ", ex);
        }

    }
    // ========================== Get delete product method ==========================

    // makes a get request as a method to triger this end-point and passes product id to delete it from data base
    @GetMapping("{id}/delete")
    // get the product id from the url and pass it alogn side with a model object as parameters
    public String deleteProduct(@PathVariable("id") Long id) {
        try {
            // use parhVariable to get the product id from url
            // find product in data base using the repository layer
            this.productRepository.deleteById(id);

            // redirect to the product list view
            return "redirect:/products/list";
            // print error in console if exception happends 
        } catch (Exception ex) {
            throw new RuntimeException("Could not delete product from data base. ", ex);
        }

    }
}

/**
 *
 * Jhonatan Samuel Martinez Hernandez Ficha 2675859 Análisis y Desarrollo De
 * Software Aprendiz SENA Año 2024
 *
 */
