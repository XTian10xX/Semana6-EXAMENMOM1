package com.cesde.banco_app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.banco_app.models.Transaccion;

public interface TransaccionRepository extends JpaRepository{
    Transaccion findById(Long id);
}

