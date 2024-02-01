package ru.netology.jdata_4_hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person {
    @EmbeddedId
    private PersonPK personPK;

    @Column(name = "phone_number", length = 12)
    private String phoneNumber;
    @Column(name = "city_of_living", length = 50)
    private String cityOfLiving;


}
