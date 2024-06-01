package onpe.bayes.onpeapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Distritos {
    @Id
    private int idDistrito;
    private String Detalle;
    public int getIdDistrito() {
        return idDistrito;
    }
    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }
    public String getDetalle() {
        return Detalle;
    }
    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    
}
