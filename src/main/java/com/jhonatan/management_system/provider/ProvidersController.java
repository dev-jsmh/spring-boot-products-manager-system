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

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/providers")
public class ProvidersController {
    // create fields for provider model and repository

    private ProvidersModel providerModel;
    private ProvidersRepository providersRepository;

// =========== pass the repository as a dependenci of the controller class
    public ProvidersController(ProvidersRepository providersRepository) {
        this.providersRepository = providersRepository;
    }

    // ================== Get the view of the module ==================
    @GetMapping("/table")
    public String providersHome(Model model) {

        List<ProvidersModel> providerList = this.providersRepository.findAll();
        model.addAttribute("providersList", providerList);
        model.addAttribute("provider", new ProvidersModel());
        return "providers/home";
    }

    ;
    
      // ================== Post new providers ==================
    @PostMapping("/create")
    public String createProvider(@ModelAttribute ProvidersModel newProvider) {
        try {
            this.providersRepository.save(newProvider);
            return "redirect:/providers/table";
        } catch (Exception ex) {
            throw new RuntimeException("It was not possible to save the new provider to the data base. Try later. ", ex);
        }
    }

    // ================== get view to modify provider information ==================
    @GetMapping("{id}/edit")// get the provider's data from
    public String mofidyProviderview(@PathVariable("id") Long provider_id, Model model) {

        // take provider from data base by its id and store the optional value return by the function below
        Optional<ProvidersModel> OptProvider = this.providersRepository.findById(provider_id);
        // verify if the provider exists 
        if (OptProvider.isPresent()) {
            // take the object from optional
            ProvidersModel currentProvider = OptProvider.get();
            // add provider to the model
            model.addAttribute("provider", currentProvider);
            return "providers/editProvider";
        } else {
            // if data doesn't exist 
               return "providers/errorProvider";
        }

        
    }

    // ================== Post method to modify provider information ==================
    @PostMapping("{id}/edit")
    public String saveEditedProviderInfo(@PathVariable("id") Long provider_id, @ModelAttribute ProvidersModel modProvider){
        // take provider from data base by its id and store the optional value return by the function below
        Optional<ProvidersModel> OptProvider = this.providersRepository.findById(provider_id);
        // verify if the provider exists 
        if (OptProvider.isPresent()) {
            // take the object from optional
            ProvidersModel currentProvider = OptProvider.get();
            
            // ==================
            currentProvider.setName(modProvider.getName());
           currentProvider.setPhone(modProvider.getPhone());
           currentProvider.setAddress(modProvider.getAddress());
            
           
           // save edited info of the provider 
           this.providersRepository.save(currentProvider);
           // redirect the user to the provider table view 
           return "redirect:/providers/table";
        } else {
            // if provider's data doesn't exist 
               return "providers/errorProvider";
        }
        
    }
    
    
    // ================== Method to delete provider information ==================
    @GetMapping("{id}/delete")
    public String delete(@PathVariable("id") Long provider_id){
        this.providersRepository.deleteById(provider_id);
        return "redirect:/providers/table";
    }
    
}

/**
 *
 * Jhonatan Samuel Martinez Hernandez Ficha 2675859 Análisis y Desarrollo De
 * Software Aprendiz SENA Año 2024
 *
 */
