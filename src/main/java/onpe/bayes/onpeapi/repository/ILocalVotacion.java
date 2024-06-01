package onpe.bayes.onpeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.bayes.onpeapi.models.LocalesVotacion;
@Repository
public interface ILocalVotacion extends JpaRepository<LocalesVotacion, Integer>{
    @Query(value = "{call sp_getLocalesVotacionByDistrito(:pro, :dist)}", nativeQuery = true) List<LocalesVotacion> getLocalesVotacion(@Param("pro") String pro, @Param("dist") String dist);
}
