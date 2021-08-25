package com.example.concesionario.Coche.application;

import com.example.concesionario.Coche.domain.CocheEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepo extends JpaRepository<CocheEntity, String> {

    public void deleteById(String id);

}
