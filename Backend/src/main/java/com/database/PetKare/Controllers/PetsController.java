package com.database.PetKare.Controllers;

import java.util.List;

import com.database.PetKare.Entities.Pets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.database.PetKare.DTOs.PetsDTO;
import com.database.PetKare.Services.PetsService;

@RestController
@CrossOrigin
@RequestMapping("/api/pets")
public class PetsController {

    @Autowired
    private PetsService petsService;

    @GetMapping
    public List<PetsDTO> getAllPets() {
        return petsService.getAllPets();
    }

    @GetMapping("/{id}")
    public PetsDTO getPetById(@PathVariable int id) {
        return petsService.getPetById(id);
    }

    @GetMapping("/filter/type")
    public List<PetsDTO> filterPetsByType(@RequestParam String type) {
        return petsService.filterPetsByType(type);
    }


    @GetMapping("/stats/type")
    public List<Object[]> getPetsCountByType() {
        return petsService.getPetsCountByType();
    }


    @GetMapping("/paginated")
    public Page<PetsDTO> getPaginatedPetsByType(@RequestParam String type, @RequestParam int page, @RequestParam int size) {
        return petsService.getPaginatedPetsByType(type, page, size);
    }

    @GetMapping("/branch/{branchId}")
    public ResponseEntity<List<Pets>> getPetsByBranch(@PathVariable("branchId") int branchId) {
        return new ResponseEntity<>(petsService.getPetsByBranchId(branchId), HttpStatus.OK);
    }

    @PostMapping
    public PetsDTO addPet(@RequestBody PetsDTO petDTO) {
        return petsService.savePet(petDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable int id) {
        petsService.deletePet(id);
    }
}
