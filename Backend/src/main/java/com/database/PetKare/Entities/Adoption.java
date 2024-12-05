package com.database.PetKare.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "adoption")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Adoption {
    
    @Id
    @Column(name = "adoption_id", length=45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int adoptionId;
    @OneToOne
    @JoinColumn(name = "pet_id", referencedColumnName = "pet_id")
    private Pets pet;
    @ManyToOne
    @JoinColumn(name = "adopter_id", referencedColumnName = "adopter_id")
    private Adopter adopter;
    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    private Branches branch;
    @Column(name = "adoption_date",columnDefinition = "timestamp(6) without time zone")
    private LocalDateTime adoptionDate;
    @Column(name = "adoption_status")
    private String adoptionStatus;
}
