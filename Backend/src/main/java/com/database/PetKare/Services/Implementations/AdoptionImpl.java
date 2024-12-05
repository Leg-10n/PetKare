package com.database.PetKare.Services.Implementations;

import com.database.PetKare.Entities.Adoption;
import com.database.PetKare.Repo.AdoptionRepo;

import com.database.PetKare.Services.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionImpl implements AdoptionService {

    @Autowired
    private AdoptionRepo adoptionRepository;

    @Override
    public Adoption createAdoption(Adoption adoption) {
        return adoptionRepository.save(adoption);
    }

    @Override
    public Adoption getAdoptionById(int adoptionId) {
        return adoptionRepository.findById(adoptionId)
                .orElseThrow(() -> new RuntimeException("Adoption not found with ID: " + adoptionId));
    }

    @Override
    public List<Adoption> getAllAdoptions() {
        return adoptionRepository.findAll();
    }

    @Override
    public Adoption updateAdoption(int adoptionId, Adoption updatedAdoption) {
        Adoption existingAdoption = getAdoptionById(adoptionId);
        existingAdoption.setPet(updatedAdoption.getPet());
        existingAdoption.setAdopter(updatedAdoption.getAdopter());
        existingAdoption.setBranch(updatedAdoption.getBranch());
        existingAdoption.setAdoptionDate(updatedAdoption.getAdoptionDate());
        existingAdoption.setAdoptionStatus(updatedAdoption.getAdoptionStatus());
        return adoptionRepository.save(existingAdoption);
    }

    @Override
    public void deleteAdoption(int adoptionId) {
        Adoption adoption = getAdoptionById(adoptionId);
        adoptionRepository.delete(adoption);
    }
}
