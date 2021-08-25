package com.example.concesionario.Coche.infraestructure.dto;

import com.example.concesionario.Coche.domain.CocheEntity;
import lombok.Data;

@Data
public class CocheOutputDTO {

    private String id;
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private String vastidor;


    public CocheOutputDTO(CocheEntity cocheEntity) {
        setId(cocheEntity.getId());
        setMarca(cocheEntity.getMarca());
        setModelo(cocheEntity.getModelo());
        setColor(cocheEntity.getColor());
        setMatricula(cocheEntity.getMatricula());
        setVastidor(cocheEntity.getVastidor());
    }

    public CocheOutputDTO() {}
}
