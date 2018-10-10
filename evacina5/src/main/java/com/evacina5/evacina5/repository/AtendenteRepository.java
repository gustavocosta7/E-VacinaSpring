package com.evacina5.evacina5.repository;

import com.evacina5.evacina5.model.Atendente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AtendenteRepository extends CrudRepository<Atendente,String> {
    boolean existsById(long var1);
    Atendente findById(long var1);
}
