package com.ejemplo.demo.service;

import com.ejemplo.demo.model.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
	public List<Persona> findAll();
	public Optional<Persona> findById(Long id);
	public Persona save(Persona persona);
	public void deleteById(Long id);
	public Optional<Persona> findByEmail(String email);
	
}
