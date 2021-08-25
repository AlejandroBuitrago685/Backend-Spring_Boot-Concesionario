package com.example.concesionario.Coche.infraestructure.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CocheInputDTO implements Serializable {

    private String id;
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private String vastidor;


}
