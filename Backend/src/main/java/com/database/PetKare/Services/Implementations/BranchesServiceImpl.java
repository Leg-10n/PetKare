package com.database.PetKare.Services.Implementations;

import com.database.PetKare.Entities.Branches;
import com.database.PetKare.Repo.BranchesRepo;
import com.database.PetKare.Services.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesServiceImpl implements BranchesService {

    @Autowired
    private BranchesRepo branchesRepo;

    @Override
    public Branches addBranch(Branches branch) {
        return branchesRepo.save(branch);
    }

    @Override
    public List<Branches> getAllBranches() {
        return branchesRepo.findAll();
    }

    @Override
    public List<Branches> getBranchesByName(String branchName) {
        return branchesRepo.findByBranchName(branchName);
    }

    @Override
    public List<Branches> getBranchesByAddress(String branchAddress) {
        return branchesRepo.findByBranchAddress(branchAddress);
    }
}
