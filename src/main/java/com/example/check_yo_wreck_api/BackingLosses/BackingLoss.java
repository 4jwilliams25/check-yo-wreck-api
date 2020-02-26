package com.example.check_yo_wreck_api.BackingLosses;

import lombok.Data;

import javax.persistence.*;
import javax.swing.text.html.Option;

@Entity
@Table(name = "backing_losses")
@Data
public class BackingLoss {

    public BackingLoss() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String iv_action;

    @Column
    String cv_action;

    @Column
    String saw_other_car;

    @Column
    String evasive_action;

    @Column
    String iv_stopped_or_moving;

    @Column
    String cv_stopped_or_moving;

    @Column
    String iv_distance_out;

    @Column
    String cv_distance_out;

    @Column
    String iv_poi;

    @Column
    String cv_poi;

    public int getId() {
        return id;
    }
}
