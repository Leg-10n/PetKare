package com.database.PetKare.Controllers;
import com.database.PetKare.Entities.Adopter;
import com.database.PetKare.Services.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/adopters")
public class AdopterController {

    @Autowired
    private AdopterService adopterService;

    @PostMapping
    public ResponseEntity<Adopter> createAdopter(@RequestBody Adopter adopter) {
        Adopter createdAdopter = adopterService.createAdopter(adopter);
        return new ResponseEntity<>(createdAdopter, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Adopter> getAdopterById(@PathVariable int id) {
        Optional<Adopter> adopter = adopterService.getAdopterById(id);
        return adopter.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Adopter>> getAllAdopters() {
        List<Adopter> adopters = adopterService.getAllAdopters();
        return new ResponseEntity<>(adopters, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Adopter> updateAdopter(@PathVariable int id, @RequestBody Adopter adopter) {
        Adopter updatedAdopter = adopterService.updateAdopter(id, adopter);
        return updatedAdopter != null ? ResponseEntity.ok(updatedAdopter)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdopter(@PathVariable int id) {
        adopterService.deleteAdopter(id);
        return ResponseEntity.noContent().build();
    }
}
