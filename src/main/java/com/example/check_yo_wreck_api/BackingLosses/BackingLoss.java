package com.example.check_yo_wreck_api.BackingLosses;

import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "backing_losses")
@Data
public class BackingLoss {

    public BackingLoss() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String accident_type;

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
