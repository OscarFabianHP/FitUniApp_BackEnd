package com.ejemplo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.ejemplo.demo.model.ImcRegistro;

public interface ImcRegistroService {
	
	public List<ImcRegistro> findAll();
	public List<ImcRegistro> findAllSort(Sort sort);
	public Optional<ImcRegistro> findById(Long id);
	public ImcRegistro save(ImcRegistro imcRegistro);
	public List<ImcRegistro> saveAll(List<ImcRegistro> list);
	public void deleteById(Long id);
	public List<ImcRegistro> findAllByPerson(Long idPerson);

}
