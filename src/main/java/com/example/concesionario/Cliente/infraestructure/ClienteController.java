package com.example.concesionario.Cliente.infraestructure;

import com.example.concesionario.Cliente.application.ClienteService;
import com.example.concesionario.Cliente.domain.ClienteEntity;
import com.example.concesionario.Cliente.infraestructure.dto.ClienteInputDTO;
import com.example.concesionario.Cliente.infraestructure.dto.ClienteOutputDTO;
import com.example.concesionario.Coche.application.CocheService;
import com.example.concesionario.Coche.domain.CocheEntity;
import com.example.concesionario.Coche.infraestructure.dto.CocheInputDTO;
import com.example.concesionario.Coche.infraestructure.dto.CocheOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v0/api/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/add")
    public String CrearCliente(@RequestBody @Valid ClienteInputDTO cliente) throws Exception {
        clienteService.AñadirCliente(cliente);
        return "Coche creado correctamente \n" + cliente;
    }

    @GetMapping("/get")
    public List<ClienteEntity> ObtenerClientes(){
        return clienteService.findAll();
    }

    @GetMapping("/getid/{id}")
    public List<ClienteOutputDTO> obtenerPorID(@PathVariable String id) throws Exception {
        return clienteService.findById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String EliminarCliente(@PathVariable String id) throws Exception {
        clienteService.deleteById(id);
        return "Cliente con ID: " + id + " borrado correctamente";
    }

    @PutMapping("/update/{id}")
    public void Actualizar(@PathVariable String id,@Valid @RequestBody ClienteEntity clienteEntity) throws Exception{
        clienteService.Actualizar(id, clienteEntity);

    }

}
