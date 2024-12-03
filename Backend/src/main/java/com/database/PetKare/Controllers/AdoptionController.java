package com.database.PetKare.Controllers;

import com.database.PetKare.Entities.Adoption;
import com.database.PetKare.Services.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/adoptions")
public class AdoptionController {

    @Autowired
    private AdoptionService adoptionService;

    @PostMapping
    public ResponseEntity<Adoption> createAdoption(@RequestBody Adoption adoption) {
        return new ResponseEntity<>(adoptionService.createAdoption(adoption), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Adoption>> getAllAdoptions() {
        return new ResponseEntity<>(adoptionService.getAllAdoptions(), HttpStatus.OK);
    }

    @GetMapping("/adopter/{adopterId}")
    public ResponseEntity<List<Adoption>> getAdoptionsByAdopterId(@PathVariable("adopterId") int adopterId) {
        return new ResponseEntity<>(adoptionService.getAdoptionsByAdopterId(adopterId), HttpStatus.OK);
    }

    @GetMapping("/pet/{petId}")
    public ResponseEntity<List<Adoption>> getAdoptionsByPetId(@PathVariable("petId") int petId) {
        return new ResponseEntity<>(adoptionService.getAdoptionsByPetId(petId), HttpStatus.OK);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Adoption>> getAdoptionsByStatus(@PathVariable("status") String adoptionStatus) {
        return new ResponseEntity<>(adoptionService.getAdoptionsByStatus(adoptionStatus), HttpStatus.OK);
    }

    @GetMapping("/date-range")
    public ResponseEntity<List<Adoption>> getAdoptionsByDateRange(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return new ResponseEntity<>(adoptionService.getAdoptionsByDateRange(startDate, endDate), HttpStatus.OK);
    }
}
