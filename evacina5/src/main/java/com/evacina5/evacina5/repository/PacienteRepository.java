package com.evacina5.evacina5.repository;

import com.evacina5.evacina5.model.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findById(long sus);
    @Query("Select c from Paciente c where c.nome like CONCAT('%',:nome,'%')")
    List<Paciente> findByNome(@Param("nome")String nome);
}
