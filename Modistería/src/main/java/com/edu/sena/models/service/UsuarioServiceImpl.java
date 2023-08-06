package com.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Usuario;
import com.edu.sena.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	

	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@Override
	public Usuario save(Usuario u) {
		return usuarioRepository.save(u);
	}
	
	
	
	
	@Override
	public String login(String user, String ctr) {
		
		Usuario usuario = usuarioRepository.findByUsername(user);
		
		if (usuario ==null) {
		return "usuario no encontrado";
		}
	
		if(!usuario.getPassword().equals(ctr)) {
		return "contraseña incorrecta";				
		}	
		
		
		return "inicio de sesión exitoso";
   }
	
	
}
