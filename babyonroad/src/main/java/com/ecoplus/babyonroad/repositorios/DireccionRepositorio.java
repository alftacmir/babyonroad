package com.ecoplus.babyonroad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoplus.babyonroad.entidades.Direccion;

@Repository
public interface DireccionRepositorio extends JpaRepository<Direccion, Long>{

}
