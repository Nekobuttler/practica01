
package practica01.practica.Service;

import practica01.practica.domain.estado;
import java.util.List;

/**
 *
 * @author okk
 */
public interface estado_Service {
    public List<estado> getEstados();
    
    public void save(estado Estado);
    //actualizar y crear
    
    public void delete(estado Estado);
    
    
    public estado getEstado(estado Estado);  //objetc and name of the object 
    
}