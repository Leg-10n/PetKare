package com.database.PetKare.Services.Implementations;

import com.database.PetKare.Entities.Adopter;
import com.database.PetKare.Repo.AdopterRepo;
import com.database.PetKare.Services.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdopterImpl implements AdopterService {

    @Autowired
    private AdopterRepo adopterRepository;

    @Override
    public Adopter createAdopter(Adopter adopter) {
        return adopterRepository.save(adopter);
    }

    @Override
    public Optional<Adopter> getAdopterById(int id) {
        return adopterRepository.findById(id);
    }

    @Override
    public List<Adopter> getAllAdopters() {
        return adopterRepository.findAll();
    }

    @Override
    public Adopter updateAdopter(int id, Adopter adopter) {
        if (adopterRepository.existsById(id)) {
            adopter.setAdopterId(id);
            return adopterRepository.save(adopter);
        }
        return null;
    }

    @Override
    public void deleteAdopter(int id) {
        adopterRepository.deleteById(id);
    }
}
