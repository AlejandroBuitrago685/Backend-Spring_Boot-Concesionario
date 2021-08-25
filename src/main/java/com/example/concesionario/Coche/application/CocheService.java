package com.example.concesionario.Coche.application;

import com.example.concesionario.Coche.domain.CocheEntity;
import com.example.concesionario.Coche.infraestructure.dto.CocheInputDTO;
import com.example.concesionario.Coche.infraestructure.dto.CocheOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocheService implements ICoche{

    @Autowired
    CocheRepo cocheRepo;

    @Override
    public CocheOutputDTO AñadirCoche(CocheInputDTO cocheDTO) throws Exception {

        CocheEntity cocheEntity = new CocheEntity(cocheDTO);
        cocheRepo.save(cocheEntity);
        CocheOutputDTO saveOutputDTO = new CocheOutputDTO(cocheEntity);
        return saveOutputDTO;

    }

    @Override
    public String deleteById(String id) throws Exception {
        cocheRepo.findById(id).orElseThrow(() -> new Exception("No se ha enocntrado el coche con el ID: " + id));
        cocheRepo.deleteById(id);
        return "El coche con ID: " + id + " se ha borrado correctamente";
    }

    @Override
    public List<CocheEntity> findAll() {
        return cocheRepo.findAll();
    }

    @Override
    public List<CocheOutputDTO> findById(String id) throws Exception {
        return (List<CocheOutputDTO>) cocheRepo.findById(id).orElseThrow(() -> new Exception("ID no encontrado"));
    }

    public void Actualizar(String id, CocheEntity cocheEntity){
        List<CocheEntity> personaEntities = cocheRepo.findAll();
        for(int i = 0; i < personaEntities.size(); i++){
            CocheEntity p = personaEntities.get(i);
            if (p.getId().equals(id)){
                personaEntities.set(i, cocheEntity);
                return;
            }
        }
    }


}
