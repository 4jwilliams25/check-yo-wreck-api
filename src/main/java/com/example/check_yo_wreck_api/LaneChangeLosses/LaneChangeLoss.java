package com.example.check_yo_wreck_api.LaneChangeLosses;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "lane_change_losses")
@Data
public class LaneChangeLoss {

    public LaneChangeLoss() {}

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
    String iv_poi;

    @Column
    String cv_poi;

    public int getId() {
        return id;
    }
}
