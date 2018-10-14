package com.evacina5.evacina5.repository;

import com.evacina5.evacina5.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findById(long sus);
}
