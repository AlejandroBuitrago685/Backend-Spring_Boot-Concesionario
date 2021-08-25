package com.example.concesionario.Cliente.domain;

import com.example.concesionario.Cliente.infraestructure.dto.ClienteInputDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class ClienteEntity {

    @Id
    @GeneratedValue(generator= "System_uuid")
    @GenericGenerator(name= "System_uuid", strategy= "uuid")
    String id;
    @NotNull
    String Nombre;
    @NotNull
    String Apellidos;
    @NotNull
    String Direccion;
    @NotNull
    String Telefono;
    @NotNull
    @Email
    String Email;

    public ClienteEntity(ClienteInputDTO clienteInputDTO){
        setId(clienteInputDTO.getId());
        setNombre(clienteInputDTO.getNombre());
        setApellidos(clienteInputDTO.getApellidos());
        setDireccion(clienteInputDTO.getDireccion());
        setEmail(clienteInputDTO.getEmail());
        setTelefono(clienteInputDTO.getTelefono());
    }

    public ClienteEntity(){}

}
