package com.cesde.banco_app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.banco_app.models.Cliente;

public interface ClienteRepository extends JpaRepository{
    Optional<Cliente> findByIdOptional(long id);
    Cliente findByName(String nombreCliente);
    Cliente findByLastName(String apellidoCliente);
}