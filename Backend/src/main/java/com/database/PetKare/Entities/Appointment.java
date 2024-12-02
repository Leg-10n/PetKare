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

@Entity
@Table(name = "appointment")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @Column(name = "appointment_id", length=45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int appointmentId;
    @Column(name = "pet_id", length=45)
    private int petId;
    @Column(name = "branch_id", length=45)
    private int branchId;
    @Column(name = "adopter_id", length=45)
    private int adopterId;
    @Column(name = "appointment_date", length=45)
    private String appointmentDate;
    @Column(name = "appointment_status", length=45)
    private String appointmentStatus;
}
