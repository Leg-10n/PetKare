package com.database.PetKare.Repo;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.database.PetKare.Entities.Appointment;

@Repository
@EnableJpaRepositories
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

    // Find appointments by pet ID
    List<Appointment> findByPetId(int petId);
    // Find appointments by status
    List<Appointment> findByAppointmentStatus(String appointmentStatus);

    // Find appointments by date range
    @Query("SELECT a FROM Appointment a WHERE a.appointmentDate BETWEEN :startDate AND :endDate")
    List<Appointment> findByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    // Find appointments for today
    @Query("SELECT a FROM Appointment a WHERE a.appointmentDate = CURRENT_DATE")
    List<Appointment> findTodayAppointments();

    // Find upcoming appointments
    @Query("SELECT a FROM Appointment a WHERE a.appointmentDate > CURRENT_DATE ORDER BY a.appointmentDate ASC")
    List<Appointment> findUpcomingAppointments();
}
