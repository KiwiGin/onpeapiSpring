package onpe.bayes.onpeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.bayes.onpeapi.models.Distritos;
@Repository
public interface IDistritos extends JpaRepository<Distritos, Integer>{
    @Query(value = "{call sp_getDistritosByProvincia(:id)}", nativeQuery = true) List<Distritos> getDistritos(@Param("id") String id);
}
