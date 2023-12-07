package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Medico;
import com.ecoplus.babyonroad.repositorios.MedicoRepositorio;

@RestController
@RequestMapping("/lista_medicos")
public class MedicoController {
	
	@Autowired
	private MedicoRepositorio medico_repositorio;
	
	@GetMapping("/todos")
	public List<Medico> listar_todos_medicos(){
		return medico_repositorio.findAll();
	}

}
