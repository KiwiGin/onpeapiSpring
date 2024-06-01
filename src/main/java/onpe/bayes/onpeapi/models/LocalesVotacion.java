package onpe.bayes.onpeapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LocalesVotacion {
    @Id
    private int idLocalVotacion;
    private String RazonSocial;
    public int getIdLocalVotacion() {
        return idLocalVotacion;
    }
    public void setIdLocalVotacion(int idLocalVotacion) {
        this.idLocalVotacion = idLocalVotacion;
    }
    public String getRazonSocial() {
        return RazonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }
    
}
