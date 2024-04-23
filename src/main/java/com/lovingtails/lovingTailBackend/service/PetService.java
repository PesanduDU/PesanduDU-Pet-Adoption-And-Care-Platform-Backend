package com.lovingtails.lovingTailBackend.service;

import com.lovingtails.lovingTailBackend.dto.PetDTO;
import com.lovingtails.lovingTailBackend.entity.Pet;
import com.lovingtails.lovingTailBackend.repo.PetRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PetService {

    @Autowired
    private PetRepo petRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<PetDTO> getAllPets(){
        List<Pet> petList = petRepo.findAll();
        return modelMapper.map(petList, new TypeToken<List<PetDTO>>(){}.getType());
    }

    public String savePet(PetDTO petDTO){
        petRepo.save(modelMapper.map(petDTO,Pet.class));
        return "Pet Saved!";
    }

    public PetDTO getPetByID(String id){
        Pet pet = petRepo.getPetByID(id);
        return modelMapper.map(pet,PetDTO.class);
    }

}
