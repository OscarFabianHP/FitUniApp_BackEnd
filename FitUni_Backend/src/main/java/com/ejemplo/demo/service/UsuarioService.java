package com.ejemplo.demo.service;

import com.ejemplo.demo.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
	public List<Usuario> findAll();
	public Optional<Usuario> findById(Long id);
	public List<Usuario> login(String username, String password);
	public Usuario save(Usuario Usuario);
	public void deleteById(Long id);
	
}
