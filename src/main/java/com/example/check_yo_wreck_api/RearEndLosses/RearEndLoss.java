package com.example.check_yo_wreck_api.RearEndLosses;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    String accident_type;

    @Column
    String number_of_cars;

    @Column
    String car_position;

    @Column
    String pushed;

    @JsonFormat(pattern = "MM-dd-yyyy", shape = JsonFormat.Shape.STRING)
    @Column
    String date_created;

    @JsonFormat(pattern = "MM-dd-yyyy", shape = JsonFormat.Shape.STRING)
    @Column
    String date_updated;

    public int getId() {
        return id;
    }
}
