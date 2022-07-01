
package practica01.practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import practica01.practica.Service.estado_Service;
import practica01.practica.domain.estado;

@Controller
@Slf4j
public class IndexController {
    
   @Autowired 
    private estado_Service estado_service;
   
   
   //aqui iniciamos la entrada de la pagina 
   
   @GetMapping("/")
   public String start(Model model){
       
       var estados = estado_service.getEstados();//se llama al objeto definido arriba y se le llama la lista de este que es lo obtenido de la base de datos
       
       model.addAttribute("estados",estados); // 
       
      
       
       return "index";
   }
   
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(estado Estado){
        
        return "Create_Estado";
    }
   
  
   @GetMapping("/modificar_Estado/{id_Estado}")            //primero obtenerlo(el id del estado), esto lo reconoce con el obtenido y el de la clase domain
   public String modificar_Estado(estado Estado,Model model){
  
       Estado=estado_service.getEstado(Estado);
       //Buscarlo en la base de datos Estado de lo obtenido en el html
       model.addAttribute("Estado",Estado);
       
       return "Create_Estado";
   }
   
   
     @GetMapping("eliminar_Estado/{id_Estado}")
    public String eliminar_Estado(estado Estado){
        estado_service.delete(Estado);
        return "redirect:/";
        
    }
   
   @PostMapping("/guardarEstado")
    public String guardarEstado(estado Estado){
        estado_service.save(Estado);
        return "redirect:/"; //redirigir a la raiz(localhost/index)
    }
    
  
    
   
}
