package com.database.PetKare.Services;

import java.util.List;

import com.database.PetKare.Entities.Pets;
import org.springframework.data.domain.Page;

import com.database.PetKare.DTOs.PetsDTO;


public interface PetsService {
    List<PetsDTO> getAllPets();
    PetsDTO getPetById(int id);
    List<PetsDTO> filterPetsByType(String type);
    List<Object[]> getPetsCountByType();
    Page<PetsDTO> getPaginatedPetsByType(String type, int page, int size);
    PetsDTO savePet(PetsDTO petDTO);
    void deletePet(int id);
    List<Pets> getPetsByBranchId(int branchId);
}
