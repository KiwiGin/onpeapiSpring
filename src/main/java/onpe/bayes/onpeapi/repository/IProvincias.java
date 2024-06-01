package onpe.bayes.onpeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.bayes.onpeapi.models.Provincia;

@Repository
public interface IProvincias extends JpaRepository<Provincia, Integer>{
    @Query(value = "{call sp_getProvinciasbyDepartamento(:id)}", nativeQuery = true) List<Provincia> getProvincias(@Param("id") String id);
}
