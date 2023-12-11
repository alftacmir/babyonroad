package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.RolModel;
import com.ecoplus.babyonroad.excepciones.ResourceNotFoundException;
import com.ecoplus.babyonroad.repositorios.RolModelRepositorio;

@RestController
@RequestMapping("/lista_roles")
@CrossOrigin(origins = "http://localhost:4200")
public class RolModelController {
	
	@Autowired
	private RolModelRepositorio rol_repositorio;
	
	@GetMapping("/todos")
	public List<RolModel> listar_todos_roles(){
		return rol_repositorio.findAll();
	}
	
	@GetMapping("/rolCliente")
	public RolModel obtenerCliente(){
		 List<RolModel> lista_rol  = rol_repositorio.findAll();
		 RolModel cliente = new RolModel();
		 for (RolModel rol : lista_rol) {
			if(rol.getTipoRol().matches("CLIENTE")) {
				cliente = rol;
				return cliente;
			}
		}
		 return null;
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RolModel> listar_rol_id(@PathVariable Long id) {
		RolModel rol = rol_repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el rol con id:" + id));
		return ResponseEntity.ok(rol);
	}

}
