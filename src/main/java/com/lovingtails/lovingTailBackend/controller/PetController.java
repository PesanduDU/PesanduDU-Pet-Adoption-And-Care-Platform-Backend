package com.lovingtails.lovingTailBackend.controller;

import com.lovingtails.lovingTailBackend.dto.PetDTO;
import com.lovingtails.lovingTailBackend.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/pet")
@CrossOrigin
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/getPets")
    public List<PetDTO> getPets(){
        return petService.getAllPets();
    }

    @PostMapping("/savePet")
    public String savePet(@RequestBody PetDTO petDTO){
        return petService.savePet(petDTO);
    }

    @GetMapping("/getPetByID/{id}")
    public PetDTO getPetByID(@PathVariable String id){
        return petService.getPetByID(id);
    }
}
