package com.example.concesionario.Coche.application;

import com.example.concesionario.Coche.domain.CocheEntity;
import com.example.concesionario.Coche.infraestructure.dto.CocheInputDTO;
import com.example.concesionario.Coche.infraestructure.dto.CocheOutputDTO;

import java.util.List;

public interface ICoche {

    public CocheOutputDTO AñadirCoche(CocheInputDTO cocheDTO) throws Exception;

    public String deleteById(String id) throws Exception;

    public List<CocheEntity> findAll();

    public List<CocheOutputDTO> findById(String id) throws Exception;

}
