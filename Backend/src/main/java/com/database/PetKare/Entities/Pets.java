package com.database.PetKare.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "pets")
public class Pets {
    
    @Id
    @Column(name = "pet_id", length=45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int petId;
    @Column(name = "pet_name", length=45)
    private String petName;
    @Column(name = "pet_type", length=45)
    private String petType;
    @Column(name = "pet_breed", length=45)
    private String petBreed;
    @Column(name = "pet_age", length=45)
    private int petAge;
    @Column(name = "pet_gender", length=45)
    private String petGender;
    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    private Branches branch;



}
