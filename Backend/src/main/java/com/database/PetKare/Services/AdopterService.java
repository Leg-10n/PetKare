package com.database.PetKare.Services;

import com.database.PetKare.Entities.Adopter;

import java.util.List;
import java.util.Optional;

public interface AdopterService {
    Adopter createAdopter(Adopter adopter);
    Optional<Adopter> getAdopterById(int id);
    List<Adopter> getAllAdopters();
    Adopter updateAdopter(int id, Adopter adopter);
    void deleteAdopter(int id);
}
