package com.database.PetKare.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "appointment")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @Column(name = "appointment_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int appointmentId;
    @Column(name = "pet_id")
    private int petId;
    @Column(name = "branch_id")
    private int branchId;
    @Column(name = "adopter_id")
    private int adopterId;
    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;
    @Column(name = "appointment_status")
    private String appointmentStatus;
}
