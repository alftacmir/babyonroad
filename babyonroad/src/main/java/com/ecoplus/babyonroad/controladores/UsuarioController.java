package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Usuarios;
import com.ecoplus.babyonroad.repositorios.UsuarioRepositorio;

@RestController
@RequestMapping("/lista_usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio usuario_repositorio;
	
	@GetMapping("/todos")
	public List<Usuarios> listar_todos_usuarios(){
		return usuario_repositorio.findAll();
	}
}
