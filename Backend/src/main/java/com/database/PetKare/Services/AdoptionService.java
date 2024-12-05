package com.database.PetKare.Services;

import com.database.PetKare.Entities.Adoption;
import java.util.List;

public interface AdoptionService {
    Adoption createAdoption(Adoption adoption);
    Adoption getAdoptionById(int adoptionId);
    List<Adoption> getAllAdoptions();
    Adoption updateAdoption(int adoptionId, Adoption updatedAdoption);
    void deleteAdoption(int adoptionId);
}
