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
    private int pet_id;
    @Column(name = "pet_name", length=45)
    private String pet_name;
    @Column(name = "pet_type", length=45)
    private String pet_type;
    @Column(name = "pet_breed", length=45)
    private String pet_breed;
    @Column(name = "pet_age", length=45)
    private int pet_age;
    @Column(name = "pet_gender", length=45)
    private String pet_gender;
    
    
}
