package com.database.PetKare.Services.Implementations;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.database.PetKare.DTOs.PetsDTO;
import com.database.PetKare.Entities.Pets;
import com.database.PetKare.Repo.PetsRepo;
import com.database.PetKare.Services.PetsService;

@Service
public class PetsServiceImpl implements PetsService {

    @Autowired
    private PetsRepo petsRepository;

    @Override
    public List<PetsDTO> getAllPets() {
        return petsRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public PetsDTO getPetById(int id) {
        return petsRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    @Override
    public List<PetsDTO> filterPetsByType(String type) {
        return petsRepository.findByPetType(type).stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<Pets> getPetsByBranchId(int branchId) {
        return petsRepository.findByBranchId(branchId);
    }

    @Override
    public List<Object[]> getPetsCountByType() {
        return petsRepository.countPetsByType();
    }


    @Override
    public Page<PetsDTO> getPaginatedPetsByType(String type, int page, int size) {
        return petsRepository.findByPetType(type, PageRequest.of(page, size))
                .map(this::convertToDTO);
    }

    @Override
    public PetsDTO savePet(PetsDTO petDTO) {
        Pets pet = convertToEntity(petDTO);
        return convertToDTO(petsRepository.save(pet));
    }

    @Override
    public void deletePet(int id) {
        petsRepository.deleteById(id);
    }

    // Utility methods for conversion
    private PetsDTO convertToDTO(Pets pet) {
        return new PetsDTO(
                pet.getPetId(),
                pet.getPetName(),
                pet.getPetType(),
                pet.getPetBreed(),
                pet.getPetAge(),
                pet.getPetGender(),
                pet.getPetImage(),
                pet.getBranch()

        );
    }

    private Pets convertToEntity(PetsDTO petDTO) {
        return new Pets(
                petDTO.getPetId(),
                petDTO.getPetName(),
                petDTO.getPetType(),
                petDTO.getPetBreed(),
                petDTO.getPetAge(),
                petDTO.getPetGender(),
                petDTO.getPetImage(),
                petDTO.getBranch()

        );
    }
}
