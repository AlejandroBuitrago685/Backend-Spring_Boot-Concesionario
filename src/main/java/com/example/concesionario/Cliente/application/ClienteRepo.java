package com.example.concesionario.Cliente.application;

import com.example.concesionario.Cliente.domain.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<ClienteEntity, String> {
    public void deleteById(String id);
}
