package com.ejemplo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ejemplo.demo.model.ImcRegistro;
import com.ejemplo.demo.repository.ImcRegistroRepository;

@Service
public class ImcRegistroServiceImpl implements ImcRegistroService{

	@Autowired
	private ImcRegistroRepository imcRepository;
	
	@Override
	public List<ImcRegistro> findAll() {
		// TODO Auto-generated method stub
		return imcRepository.findAll();
	}

	@Override
	public List<ImcRegistro> findAllSort(Sort sort) {
		// TODO Auto-generated method stub
		return imcRepository.findAll(sort);
	}

	@Override
	public Optional<ImcRegistro> findById(Long id) {
		// TODO Auto-generated method stub
		return imcRepository.findById(id);
	}

	@Override
	public ImcRegistro save(ImcRegistro imcRegistro) {
		// TODO Auto-generated method stub
		return imcRepository.save(imcRegistro);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		imcRepository.deleteById(id);
	}

	@Override
	public List<ImcRegistro> findAllByPerson(Long idPerson) {
		// TODO Auto-generated method stub
		return imcRepository.findAllByPerson(idPerson);
	}

	@Override
	public List<ImcRegistro> saveAll(List<ImcRegistro> list) {
		// TODO Auto-generated method stub
		return imcRepository.saveAll(list);
	}
	

}
