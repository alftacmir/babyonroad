package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Usuarios;
import com.ecoplus.babyonroad.excepciones.ResourceNotFoundException;
import com.ecoplus.babyonroad.repositorios.UsuarioRepositorio;

@RestController
@RequestMapping("/lista_usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio usuario_repositorio;
	
	@GetMapping("/todos")
	public List<Usuarios> listar_todos_usuarios(){
		return usuario_repositorio.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuarios> listar_usuario_id(@PathVariable Long id) {
		Usuarios usuario = usuario_repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el usuario con id:" + id));
		return ResponseEntity.ok(usuario);
	}
	
	@GetMapping("/ultimo")
	public Usuarios ultima_direccion(){
		List<Usuarios> lista_usuarios = usuario_repositorio.findAll();
		return lista_usuarios.getLast();
	}
	
	@PostMapping("/user")
	public Long login(@RequestBody Usuarios usuario) {
		List<Usuarios> lista = usuario_repositorio.findAll();
		for (Usuarios usuario_lista : lista) {
			if(usuario_lista.getNombre_Usuario().equals(usuario.getNombre_Usuario()) && usuario_lista.getContrasena().equals(usuario.getContrasena())) {
				Long id_usuario = usuario_lista.getId();
				return id_usuario;
			}
		}
		return (long) 0;
	}
	
	@PostMapping("/nuevo")
	public Usuarios guardarPlan(@RequestBody Usuarios usuario) {
		return usuario_repositorio.save(usuario);
	}
	
}
