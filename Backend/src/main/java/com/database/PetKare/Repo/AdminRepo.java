package com.database.PetKare.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.PetKare.Entities.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

    // Custom query method to find an Admin by username
    Optional<Admin> findByAdminName(String adminName);
}
