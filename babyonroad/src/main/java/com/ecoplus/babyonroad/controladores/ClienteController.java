package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Cliente;
import com.ecoplus.babyonroad.repositorios.ClienteRepositorio;

@RestController
@RequestMapping("/lista_clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

	@Autowired
	private ClienteRepositorio cliente_repositorio;

	@GetMapping("/todos")
	public List<Cliente> listar_todos_clientes() {
		return cliente_repositorio.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listar_cliente_id(@PathVariable Long id) {
		List<Cliente> lista_clientes = cliente_repositorio.findAll();
		for (Cliente cliente : lista_clientes) {
			if(cliente.getUsuario().getId().equals(id)) {
				return ResponseEntity.ok(cliente);
			}
		}
		return null;
		
	}
}
