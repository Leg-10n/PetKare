package com.database.PetKare.Controllers;

import com.database.PetKare.Entities.Adoption;
import com.database.PetKare.Services.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/adoptions")
public class AdoptionController {

    @Autowired
    private AdoptionService adoptionService;

    // Create a new adoption
    @PostMapping
    public ResponseEntity<Adoption> createAdoption(@RequestBody Adoption adoption) {
        Adoption createdAdoption = adoptionService.createAdoption(adoption);
        return ResponseEntity.ok(createdAdoption);
    }

    // Get a specific adoption by ID
    @GetMapping("/{id}")
    public ResponseEntity<Adoption> getAdoptionById(@PathVariable int id) {
        Adoption adoption = adoptionService.getAdoptionById(id);
        return ResponseEntity.ok(adoption);
    }

    // Get all adoptions
    @GetMapping
    public ResponseEntity<List<Adoption>> getAllAdoptions() {
        List<Adoption> adoptions = adoptionService.getAllAdoptions();
        return ResponseEntity.ok(adoptions);
    }

    // Update an existing adoption
    @PutMapping("/{id}")
    public ResponseEntity<Adoption> updateAdoption(
            @PathVariable int id,
            @RequestBody Adoption updatedAdoption
    ) {
        Adoption adoption = adoptionService.updateAdoption(id, updatedAdoption);
        return ResponseEntity.ok(adoption);
    }

    // Delete an adoption by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdoption(@PathVariable int id) {
        adoptionService.deleteAdoption(id);
        return ResponseEntity.noContent().build();
    }
}
