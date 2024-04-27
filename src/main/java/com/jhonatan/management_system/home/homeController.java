
package com.jhonatan.management_system.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * Jhonatan Samuel Martinez Hernandez Ficha 2675859 Análisis y Desarrollo De
 * Software Aprendiz SENA Año 2024
 *
 */


/**
 This is home controller. It controles the index view of the program
 * a presentation page 
 */

@Controller()
@RequestMapping()
public class homeController {
    
    // ========================== home view for all system ( index page ) ==========================
    
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
