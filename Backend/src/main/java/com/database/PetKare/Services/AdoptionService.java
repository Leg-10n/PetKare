package com.database.PetKare.Services;

import com.database.PetKare.Entities.Adoption;

import java.time.LocalDate;
import java.util.List;

public interface AdoptionService {

    Adoption createAdoption(Adoption adoption);

    List<Adoption> getAllAdoptions();

    List<Adoption> getAdoptionsByAdopterId(int adopterId);

    List<Adoption> getAdoptionsByPetId(int petId);

    List<Adoption> getAdoptionsByStatus(String adoptionStatus);

    List<Adoption> getAdoptionsByDateRange(LocalDate startDate, LocalDate endDate);
}
