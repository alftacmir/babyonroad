package com.ecoplus.babyonroad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoplus.babyonroad.entidades.Servicio;

@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio, Long>{

}
