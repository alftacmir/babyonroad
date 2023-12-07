package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.RolModel;
import com.ecoplus.babyonroad.repositorios.RolModelRepositorio;

@RestController
@RequestMapping("/lista_roles")
public class RolModelController {
	
	@Autowired
	private RolModelRepositorio rol_repositorio;
	
	@GetMapping("/todos")
	public List<RolModel> listar_todos_roles(){
		return rol_repositorio.findAll();
	}

}
