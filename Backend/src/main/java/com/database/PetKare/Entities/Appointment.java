package com.database.PetKare.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    private int appointment_id;
    @Column(name = "pet_id", length=45)
    private int pet_id;
    @Column(name = "branch_id", length=45)
    private int branch_id;
    @Column(name = "adopter_id", length=45)
    private int adopter_id;
    @Column(name = "appointment_date", length=45)
    private String appointment_date;
    @Column(name = "appointment_status", length=45)
    private String appointment_status;
}
