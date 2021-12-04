package com.ejemplo.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.demo.model.ImcRegistro;

@Repository
public interface ImcRegistroRepository extends JpaRepository<ImcRegistro, Long>{
	
	@Query("select i from ImcRegistro i where i.idPersona.id = ?1")
	List<ImcRegistro> findAllByPerson(Long idPersona);
}
