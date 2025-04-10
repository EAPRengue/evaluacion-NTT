package com.example.evaluacionNTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.evaluacionNTT.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
