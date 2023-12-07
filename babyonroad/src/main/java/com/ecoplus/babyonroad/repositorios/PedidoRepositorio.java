package com.ecoplus.babyonroad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoplus.babyonroad.entidades.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

}
