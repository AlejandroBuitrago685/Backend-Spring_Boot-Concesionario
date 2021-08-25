package com.example.concesionario.Cliente.infraestructure.dto;

import com.example.concesionario.Cliente.domain.ClienteEntity;
import com.example.concesionario.Coche.domain.CocheEntity;
import lombok.Data;

@Data
public class ClienteOutputDTO {

    private String id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String telefono;

    public ClienteOutputDTO(ClienteEntity clienteEntity) {
        setId(clienteEntity.getId());
        setNombre(clienteEntity.getNombre());
        setApellidos(clienteEntity.getApellidos());
        setDireccion(clienteEntity.getDireccion());
        setEmail(clienteEntity.getEmail());
        setTelefono(clienteEntity.getTelefono());
    }


}
