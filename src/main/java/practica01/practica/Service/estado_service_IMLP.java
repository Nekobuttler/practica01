
package practica01.practica.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practica01.practica.CRUD.crud;
import practica01.practica.domain.estado;






@Service
public class estado_service_IMLP implements estado_Service{

 @Autowired
 private crud estado_CRUD;
    
    @Override
    @Transactional(readOnly=true) 
    public List<estado> getEstados() {
        return (List<estado>) estado_CRUD.findAll();
        
         }


        @Override
        @Transactional
        public void save(estado Estado) {
            estado_CRUD.save(Estado);
        }

        @Override
        @Transactional
        public void delete(estado Estado) {
            estado_CRUD.delete(Estado);
        }

        @Override
        @Transactional(readOnly=true)
        public estado getEstado(estado Estado) {
            return estado_CRUD.findById(Estado.getId_Estado()).orElse(null);
        }
        
}

    
        












    


