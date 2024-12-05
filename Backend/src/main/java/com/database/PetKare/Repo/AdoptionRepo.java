package com.database.PetKare.Repo;

import com.database.PetKare.Entities.Adoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AdoptionRepo extends JpaRepository<Adoption, Integer> {

    // Find adoptions by status
    List<Adoption> findByAdoptionStatus(String adoptionStatus);

    // Find adoptions by date range
    @Query("SELECT a FROM Adoption a WHERE a.adoptionDate BETWEEN :startDate AND :endDate")
    List<Adoption> findByDateRange(
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );
}
