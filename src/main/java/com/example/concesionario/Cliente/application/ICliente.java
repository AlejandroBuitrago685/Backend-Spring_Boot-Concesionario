package com.example.concesionario.Cliente.application;

import com.example.concesionario.Cliente.domain.ClienteEntity;
import com.example.concesionario.Cliente.infraestructure.dto.ClienteInputDTO;
import com.example.concesionario.Cliente.infraestructure.dto.ClienteOutputDTO;

import java.util.List;

public interface ICliente {

    public ClienteOutputDTO AñadirCliente(ClienteInputDTO clienteInputDTO) throws Exception;

    public String deleteById(String id) throws Exception;

    public List<ClienteEntity> findAll();

    public List<ClienteOutputDTO> findById(String id) throws Exception;

}
