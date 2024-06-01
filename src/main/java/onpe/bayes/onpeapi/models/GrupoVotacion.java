package onpe.bayes.onpeapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GrupoVotacion {
    @Id
    private String idGrupoVotacion;

    public String getIdGrupoVotacion() {
        return idGrupoVotacion;
    }

    public void setIdGrupoVotacion(String idGrupoVotacion) {
        this.idGrupoVotacion = idGrupoVotacion;
    }
}
