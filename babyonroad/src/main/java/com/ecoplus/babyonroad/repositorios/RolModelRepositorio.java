package com.ecoplus.babyonroad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoplus.babyonroad.entidades.RolModel;

@Repository
public interface RolModelRepositorio extends JpaRepository<RolModel, Long>{
	
}
