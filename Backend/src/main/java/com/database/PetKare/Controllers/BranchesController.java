package com.database.PetKare.Controllers;

import com.database.PetKare.Entities.Branches;
import com.database.PetKare.Services.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branches")
public class BranchesController {

    @Autowired
    private BranchesService branchesService;

    @PostMapping
    public ResponseEntity<Branches> addBranch(@RequestBody Branches branch) {
        return new ResponseEntity<>(branchesService.addBranch(branch), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Branches>> getAllBranches() {
        return new ResponseEntity<>(branchesService.getAllBranches(), HttpStatus.OK);
    }

    @GetMapping("/name/{branchName}")
    public ResponseEntity<List<Branches>> getBranchesByName(@PathVariable("branchName") String branchName) {
        return new ResponseEntity<>(branchesService.getBranchesByName(branchName), HttpStatus.OK);
    }

    @GetMapping("/address/{branchAddress}")
    public ResponseEntity<List<Branches>> getBranchesByAddress(@PathVariable("branchAddress") String branchAddress) {
        return new ResponseEntity<>(branchesService.getBranchesByAddress(branchAddress), HttpStatus.OK);
    }
}
