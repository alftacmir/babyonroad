package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Direccion;
import com.ecoplus.babyonroad.repositorios.DireccionRepositorio;

@RestController
@RequestMapping("/lista_direcciones")
@CrossOrigin(origins = "http://localhost:4200")
public class DireccionController {
	
	@Autowired
	private DireccionRepositorio direccion_repositorio;
	
	@GetMapping("/todos")
	public List<Direccion> listar_todos_direcciones(){
		return direccion_repositorio.findAll();
	}
	
	@GetMapping("/ultimo")
	public Direccion ultima_direccion(){
		List<Direccion> lista_direcciones = direccion_repositorio.findAll();
		return lista_direcciones.getLast();
	}
	
	@PostMapping("/nuevo")
	public Direccion guardarPlan(@RequestBody Direccion direccion) {
		return direccion_repositorio.save(direccion);
	}
}
