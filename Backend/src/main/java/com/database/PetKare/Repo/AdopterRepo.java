package com.database.PetKare.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.PetKare.Entities.Adopter;

public interface AdopterRepo extends JpaRepository<Adopter, Integer> {
    
    // Custom query method to find an Adopter by adopterName
    Optional<Adopter> findByAdopterName(String adopterName);
    
    // Custom query method to check if an Adopter exists by adopterAddress
    boolean existsByAdopterAddress(String adopterAddress);
}
