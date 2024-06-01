package onpe.bayes.onpeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.bayes.onpeapi.models.ActasNumero;

@Repository
public interface IActasNumero extends JpaRepository<ActasNumero, String>{
    @Query(value = "{call sp_getGrupoVotacion(:num)}", nativeQuery = true) List<ActasNumero> getActasNumero(@Param("num") String num);

    @Query(value = "{call sp_getGrupoVotacion(:num)}", nativeQuery = true) List<ActasNumero> getActaNumero(@Param("num") String num);
}
