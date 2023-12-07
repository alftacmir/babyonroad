package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Servicio;
import com.ecoplus.babyonroad.repositorios.ServicioRepositorio;

@RestController
@RequestMapping("/lista_servicios")
@CrossOrigin(origins = "http://localhost:4200")
public class ServicioController {
	

	
	@Autowired
	private ServicioRepositorio servicio_repositorio;
	
	@GetMapping("/todos")
	public List<Servicio> listar_todos_servicios(){
		return servicio_repositorio.findAll();
	}
}
