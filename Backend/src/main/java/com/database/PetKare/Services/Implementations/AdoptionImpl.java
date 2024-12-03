package com.database.PetKare.Services.Implementations;

import com.database.PetKare.Entities.Adoption;
import com.database.PetKare.Repo.AdoptionRepo;
import com.database.PetKare.Services.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AdoptionImpl implements AdoptionService {

    @Autowired
    private AdoptionRepo adoptionRepo;

    @Override
    public Adoption createAdoption(Adoption adoption) {
        return adoptionRepo.save(adoption);
    }

    @Override
    public List<Adoption> getAllAdoptions() {
        return adoptionRepo.findAll();
    }

    @Override
    public List<Adoption> getAdoptionsByAdopterId(int adopterId) {
        return adoptionRepo.findByAdopterId(adopterId);
    }

    @Override
    public List<Adoption> getAdoptionsByPetId(int petId) {
        return adoptionRepo.findByPetId(petId);
    }

    @Override
    public List<Adoption> getAdoptionsByStatus(String adoptionStatus) {
        return adoptionRepo.findByAdoptionStatus(adoptionStatus);
    }

    @Override
    public List<Adoption> getAdoptionsByDateRange(LocalDate startDate, LocalDate endDate) {
        return adoptionRepo.findByDateRange(startDate, endDate);
    }
}
