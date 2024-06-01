package onpe.bayes.onpeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import onpe.bayes.onpeapi.models.Departamentos;

@Repository
public interface IDepartamentos extends JpaRepository<Departamentos, Integer>{
    @Query(value = "{call sp_getDepartamentos(:ini, :fin)}", nativeQuery = true) List<Departamentos> getDepartamentos(@Param("ini") int ini, @Param("fin") int fin);
}
