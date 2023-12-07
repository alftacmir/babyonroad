package com.ecoplus.babyonroad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoplus.babyonroad.entidades.Pedido;
import com.ecoplus.babyonroad.repositorios.PedidoRepositorio;

@RestController
@RequestMapping("/lista_pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoRepositorio pedido_repositorio;
	
	@GetMapping("/todos")
	public List<Pedido> listar_todos_pedidos(){
		return pedido_repositorio.findAll();
	}

}
