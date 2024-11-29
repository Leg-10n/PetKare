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
@Table(name = "adopters")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Adopter {

    @Id
    @Column(name = "adopter_id", length=45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int adopter_id;
    @Column(name = "adopter_name", length=45)
    private String adopter_name;
    @Column(name = "adopter_address", length=45)
    private String adopter_address;
    @Column(name = "adopter_contact", length=45)
    private int adopter_contact;
}