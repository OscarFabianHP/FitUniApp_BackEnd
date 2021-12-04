package com.ejemplo.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.demo.model.ImcRegistro;
import com.ejemplo.demo.model.Persona;
import com.ejemplo.demo.service.ImcRegistroService;

@RestController
@RequestMapping("/api/registros")
public class ImcRegistroController {

	@Autowired
	private ImcRegistroService imcService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody ImcRegistro imcRegistro){
		return ResponseEntity.status(HttpStatus.CREATED).body(imcService.save(imcRegistro));
	}
	
	@PostMapping("/list")
	public ResponseEntity<?> createAll(@RequestBody List<ImcRegistro> list){
		return ResponseEntity.status(HttpStatus.CREATED).body(imcService.saveAll(list));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable Long id){
		Optional<ImcRegistro> registro = imcService.findById(id);
		if(!registro.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		return ResponseEntity.ok(registro);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody ImcRegistro imcRegistro, @PathVariable Long id){
		Optional<ImcRegistro> registro = imcService.findById(id);
		if(!registro.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(imcRegistro, registro.get());
		registro.get().setId(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(imcService.save(registro.get()));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		Optional<ImcRegistro> registro = imcService.findById(id);
		if(!registro.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		imcService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public List<ImcRegistro> readAll(){
		List<ImcRegistro> registros = StreamSupport
				.stream(imcService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return registros;
	}
	
	@GetMapping("/idpersona/{id}")
	public List<ImcRegistro> readAllPersona(@PathVariable Long id){
		List<ImcRegistro> registros = StreamSupport
				.stream(imcService.findAllByPerson(id).spliterator(), false)
				.collect(Collectors.toList());
		return registros;
	}
}
