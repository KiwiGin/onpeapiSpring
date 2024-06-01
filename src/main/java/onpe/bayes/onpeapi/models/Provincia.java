package onpe.bayes.onpeapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Provincia {
    @Id
    private int idProvincia;
    private String Detalle;
    public int getIdProvincia() {
        return idProvincia;
    }
    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    public String getDetalle() {
        return Detalle;
    }
    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    
}
