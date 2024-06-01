package onpe.bayes.onpeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.bayes.onpeapi.models.GrupoVotacion;

@Repository
public interface IGruposVotacion extends JpaRepository<GrupoVotacion, String>{
    @Query(value = "{call sp_getGruposVotacionByProvinciaDistritoLocal(:pro, :dist, :local)}", nativeQuery = true) List<GrupoVotacion> getGruposVotacion(@Param("pro") String pro, @Param("dist") String dist, @Param("local") String local);
}
