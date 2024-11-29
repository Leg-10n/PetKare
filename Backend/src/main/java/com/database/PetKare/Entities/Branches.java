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
@Table(name = "Branches")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Branches { 

    @Id
    @Column(name = "branch_id", length=45)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int branch_id;

    @Column(name = "branch_name", length=45)
    private String branch_name;

    @Column(name = "branch_address", length=45)
    private String branch_address;

    @Column(name = "branch_contact", length=45)
    private int branch_contact;
 
}


