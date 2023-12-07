package com.ecoplus.babyonroad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoplus.babyonroad.entidades.Medico;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, Long>{

}
