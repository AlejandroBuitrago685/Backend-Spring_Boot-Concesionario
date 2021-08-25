package com.example.concesionario.Coche.domain;

import com.example.concesionario.Coche.infraestructure.dto.CocheInputDTO;
import com.example.concesionario.Coche.infraestructure.dto.CocheOutputDTO;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
public class CocheEntity {

    @Id
    @GeneratedValue (generator= "System_uuid")
    @GenericGenerator(name= "System_uuid", strategy= "uuid")
    String id;

    @NotNull
    String marca;

    @NotNull
    String modelo;

    @NotNull
    String color;

    @NotNull
    String matricula;

    @NotNull
    String vastidor;


    public CocheEntity(CocheInputDTO cocheDTO){
        setId(cocheDTO.getId());
        setMarca(cocheDTO.getMarca());
        setModelo(cocheDTO.getModelo());
        setColor(cocheDTO.getColor());
        setMatricula(cocheDTO.getMatricula());
        setVastidor(cocheDTO.getVastidor());
    }

    public CocheEntity(){}

}
