	package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Plan;
import com.ecoplus.babyonroad.repositorios.PlanRepositorio;

@RestController
@RequestMapping("/lista_planes")
@CrossOrigin(origins = "http://localhost:4200")
public class PlanController {
	
	@Autowired
	private PlanRepositorio plan_repositorio;
	
	@GetMapping("/todos")
	public List<Plan> listar_todos_planes(){
		return plan_repositorio.findAll();
	}

}
