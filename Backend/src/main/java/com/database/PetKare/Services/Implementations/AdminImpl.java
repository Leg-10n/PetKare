package com.database.PetKare.Services.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.PetKare.Entities.Admin;
import com.database.PetKare.Repo.AdminRepo;
import com.database.PetKare.Services.AdminService;

import java.util.Optional;

@Service
public class AdminImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    // Find an admin by username
    @Override
    public Optional<Admin> findByAdminName(String adminName) {
        return adminRepo.findByAdminName(adminName);
    }

    // Save an admin
    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    // Find admin by ID
    @Override
    public Optional<Admin> findById(int adminId) {
        return adminRepo.findById(adminId);
    }

    // Delete admin by ID
    @Override
    public void deleteAdmin(int adminId) {
        adminRepo.deleteById(adminId);
    }
}
