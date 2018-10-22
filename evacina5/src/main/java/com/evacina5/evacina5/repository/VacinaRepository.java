package com.evacina5.evacina5.repository;

import com.evacina5.evacina5.model.Vacina;
import org.springframework.data.repository.CrudRepository;

public interface VacinaRepository extends CrudRepository<Vacina,String> {

	Vacina findById(long id);
}
