package com.database.PetKare.Services;

import com.database.PetKare.Entities.Admin;

import java.util.Optional;

public interface AdminService {

    Optional<Admin> findByAdminName(String adminName);

    Admin saveAdmin(Admin admin);

    Optional<Admin> findById(int adminId);

    void deleteAdmin(int adminId);
}
