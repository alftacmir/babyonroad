package com.ecoplus.babyonroad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoplus.babyonroad.entidades.Usuarios;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long>{

}
