package com.example.check_yo_wreck_api.RearEndLosses;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rear_end_losses")
@Data
public class RearEndLoss {

    public RearEndLoss() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String number_of_cars;

    @Column
    String car_position;

    @Column
    String pushed;

    public int getId() {
        return id;
    }
}
