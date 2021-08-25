package com.example.concesionario.Cliente.application;

import com.example.concesionario.Cliente.domain.ClienteEntity;
import com.example.concesionario.Cliente.infraestructure.dto.ClienteInputDTO;
import com.example.concesionario.Cliente.infraestructure.dto.ClienteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ICliente {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ClienteRepo clienteRepo;

    @Override
    public ClienteOutputDTO AñadirCliente(ClienteInputDTO clienteInputDTO) throws Exception {
        ClienteEntity clienteEntity = new ClienteEntity(clienteInputDTO);
        clienteRepo.save(clienteEntity);
        ClienteOutputDTO saveOutputDTO = new ClienteOutputDTO(clienteEntity);
        return saveOutputDTO;
    }

    @Override
    public String deleteById(String id) throws Exception {
        clienteRepo.findById(id).orElseThrow(() -> new Exception("No se ha enocntrado el cliente con el ID: " + id));
        clienteRepo.deleteById(id);
        return "El cliente con ID: " + id + " se ha borrado correctamente";
    }

    @Override
    public List<ClienteEntity> findAll() {
        return clienteRepo.findAll();
    }

    @Override
    public List<ClienteOutputDTO> findById(String id) throws Exception {
        return (List<ClienteOutputDTO>) clienteRepo.findById(id).orElseThrow(() -> new Exception("ID no encontrado"));
    }

    public void Actualizar(String id, ClienteEntity clienteEntity){
        List<ClienteEntity> personaEntities = clienteRepo.findAll();
        for(int i = 0; i < personaEntities.size(); i++){
            ClienteEntity p = personaEntities.get(i);
            if (p.getId().equals(id)){
                personaEntities.set(i, clienteEntity);
                return;
            }
        }
    }
}
