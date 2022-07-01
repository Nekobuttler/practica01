
package practica01.practica.domain;

//class for define getters/setters... etc

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="estado") //esto define el nombr ede la tabla en el sql
public class estado implements Serializable{
    
     //Para utilizarlo en la generación de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Estado;
    
    String nombre_Estado;
    String pais;
    int costas;
    int poblacion;
    

    public estado(){
        
    }
    public estado(String nombre_Estado, String pais, int costas, int poblacion) {
        this.nombre_Estado = nombre_Estado;
        
        this.pais = pais;
        
        this.poblacion = poblacion;
        
        
        
        this.costas = costas;
    }

    
    
}

