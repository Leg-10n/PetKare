package com.database.PetKare.Controllers;

import com.database.PetKare.Entities.Admin;
import com.database.PetKare.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private  AdminService adminService;

    // Endpoint to login an admin (assuming password validation is done manually here)
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Admin admin) {
        Optional<Admin> existingAdmin = adminService.findByAdminName(admin.getAdminName());

        if (existingAdmin.isPresent() && existingAdmin.get().getPassword().equals(admin.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }

    // Endpoint to create a new admin
    @PostMapping("/create")
    public ResponseEntity<String> createAdmin(@RequestBody Admin admin) {
        adminService.saveAdmin(admin);
        return ResponseEntity.ok("Admin created successfully");
    }

    // Endpoint to get admin details by ID
    @GetMapping("/get/{adminId}")
    public ResponseEntity<Admin> getAdminById(@PathVariable int adminId) {
        Optional<Admin> admin = adminService.findById(adminId);
        if (admin.isPresent()) {
            return ResponseEntity.ok(admin.get());
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }

    // Endpoint to delete an admin by ID
    @DeleteMapping("/delete/{adminId}")
    public ResponseEntity<String> deleteAdmin(@PathVariable int adminId) {
        Optional<Admin> admin = adminService.findById(adminId);
        if (admin.isPresent()) {
            adminService.deleteAdmin(adminId);
            return ResponseEntity.ok("Admin deleted successfully");
        } else {
            return ResponseEntity.status(404).body("Admin not found");
        }
    }
}
