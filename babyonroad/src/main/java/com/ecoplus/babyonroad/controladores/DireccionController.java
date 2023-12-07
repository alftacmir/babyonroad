package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Direccion;
import com.ecoplus.babyonroad.repositorios.DireccionRepositorio;

@RestController
@RequestMapping("/lista_direcciones")
public class DireccionController {
	
	@Autowired
	private DireccionRepositorio direccion_repositorio;
	
	@GetMapping("/todos")
	public List<Direccion> listar_todos_direcciones(){
		return direccion_repositorio.findAll();
	}
}
