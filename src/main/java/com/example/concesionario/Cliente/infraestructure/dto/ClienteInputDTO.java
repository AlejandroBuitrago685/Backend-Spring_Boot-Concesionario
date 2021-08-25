package com.example.concesionario.Cliente.infraestructure.dto;

import lombok.Data;

@Data
public class ClienteInputDTO {
    private String id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String telefono;
}
