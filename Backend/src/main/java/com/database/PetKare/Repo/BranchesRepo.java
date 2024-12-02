package com.database.PetKare.Repo;

import com.database.PetKare.Entities.Branches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface BranchesRepo extends JpaRepository<Branches, Integer> {

    // Find branches by name (case-insensitive)
    @Query("SELECT b FROM Branches b WHERE LOWER(b.branchName) LIKE LOWER(CONCAT('%', :branchName, '%'))")
    List<Branches> findByBranchName(@Param("branchName") String branchName);

    // Find branches by address (case-insensitive)
    @Query("SELECT b FROM Branches b WHERE LOWER(b.branchAddress) LIKE LOWER(CONCAT('%', :branchAddress, '%'))")
    List<Branches> findByBranchAddress(@Param("branchAddress") String branchAddress);
}
