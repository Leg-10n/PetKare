package com.database.PetKare.Services;

import com.database.PetKare.Entities.Branches;

import java.util.List;

public interface BranchesService {

    Branches addBranch(Branches branch);

    List<Branches> getAllBranches();

    List<Branches> getBranchesByName(String branchName);

    List<Branches> getBranchesByAddress(String branchAddress);
}
