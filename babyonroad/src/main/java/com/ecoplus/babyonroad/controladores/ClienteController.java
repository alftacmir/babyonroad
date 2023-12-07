package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Cliente;
import com.ecoplus.babyonroad.repositorios.ClienteRepositorio;

@RestController
@RequestMapping("/lista_clientes")
public class ClienteController {

	@Autowired
	private ClienteRepositorio cliente_repositorio;
	
	@GetMapping("/todos")
	public List<Cliente> listar_todos_clientes() {
		return cliente_repositorio.findAll();
	}
}
