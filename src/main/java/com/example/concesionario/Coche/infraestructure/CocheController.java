package com.example.concesionario.Coche.infraestructure;

import com.example.concesionario.Coche.application.CocheService;
import com.example.concesionario.Coche.domain.CocheEntity;
import com.example.concesionario.Coche.infraestructure.dto.CocheInputDTO;
import com.example.concesionario.Coche.infraestructure.dto.CocheOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v0/api/coche")
public class CocheController {

    @Autowired
    CocheService cocheService;

    @PostMapping("/add")
    public String CrearCoche(@RequestBody @Valid CocheInputDTO coche) throws Exception {
        cocheService.AñadirCoche(coche);
        return "Coche creado correctamente \n" + coche;
    }

    @GetMapping("/get")
    public List<CocheEntity> ObtenerCoches(){
        return cocheService.findAll();
    }

    @GetMapping("/getid/{id}")
    public List<CocheOutputDTO> obtenerPorID(@PathVariable String id) throws Exception {
        return cocheService.findById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String EliminarCoche(@PathVariable String id) throws Exception {
        cocheService.deleteById(id);
        return "Coche con ID: " + id + " borrado correctamente";
    }

    @PutMapping("/update/{id}")
    public void Actualizar(@PathVariable String id,@Valid @RequestBody CocheEntity cocheEntity) throws Exception{
        cocheService.Actualizar(id, cocheEntity);

    }

}
