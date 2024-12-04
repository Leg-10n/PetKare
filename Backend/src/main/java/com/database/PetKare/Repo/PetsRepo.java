package com.database.PetKare.Repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.database.PetKare.Entities.Pets;

@Repository
@EnableJpaRepositories
public interface PetsRepo extends JpaRepository<Pets, Integer> {

    // Filter pets by type
    List<Pets> findByPetType(String petType);

    // Aggregate: Count pets by type
    @Query("SELECT p.petType, COUNT(p) FROM Pets p GROUP BY p.petType")
    List<Object[]> countPetsByType();

    // Find pets by branch
    @Query("SELECT p FROM Pets p WHERE p.branch.branchId = :branchId")
    List<Pets> findByBranchId(@Param("branchId") int branchId);

    // Pagination: Paginate pets by type
    Page<Pets> findByPetType(String type, Pageable pageable);
}
