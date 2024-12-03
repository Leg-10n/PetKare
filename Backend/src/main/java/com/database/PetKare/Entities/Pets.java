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
    @Column(name = "pet_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int petId;
    @Column(name = "pet_name")
    private String petName;
    @Column(name = "pet_type")
    private String petType;
    @Column(name = "pet_breed")
    private String petBreed;
    @Column(name = "pet_age")
    private int petAge;
    @Column(name = "pet_gender")
    private String petGender;
    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    private Branches branch;



}
