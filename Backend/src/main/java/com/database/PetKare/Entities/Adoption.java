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
    private int adoption_id;
    @Column(name = "pet_id", length=45)
    private int pet_id;
    @Column(name = "adopter_id", length=45)
    private int adopter_id;
    @Column(name = "branch_id", length=45)
    private int branch_id;
    @Column(name = "adoption_date", length=45)
    private String adoption_date;
    @Column(name = "adoption_status", length=45)
    private String adoption_status;
}
