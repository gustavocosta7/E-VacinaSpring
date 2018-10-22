package com.evacina5.evacina5.repository;

import com.evacina5.evacina5.model.Atendente;
import com.evacina5.evacina5.model.Local;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AtendenteRepository extends CrudRepository<Atendente,String> {
    boolean existsById(long var1);
    Atendente findById(long var1);
    List<Atendente> findAll();
    @Query("Select c from Local c where c.nome like CONCAT('%',:nome,'%')")
    List<Atendente> findByNome(@Param("nome")String nome);
}
