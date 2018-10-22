package com.evacina5.evacina5.repository;

import com.evacina5.evacina5.model.Local;
import com.evacina5.evacina5.model.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalRepository extends CrudRepository<Local, String> {
    Local findById(long id);
    @Query("Select c from Local c where c.nome like CONCAT('%',:nome,'%')")
    List<Local> findByNome(@Param("nome")String nome);
}
