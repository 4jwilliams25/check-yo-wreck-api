--backing losses
INSERT INTO backing_losses(accident_type, cv_action, cv_distance_out, cv_poi, cv_stopped_or_moving, evasive_action, iv_action, iv_distance_out, iv_poi, iv_stopped_or_moving, saw_other_car, date_created, date_updated) VALUES
('backing', 'backing', 'half', 'rearBumper', 'moving', '', 'forward', '', 'rightFender', 'moving', 'no', '10-10-2019', '10-12-2019');
INSERT INTO backing_losses(accident_type, cv_action, cv_distance_out, cv_poi, cv_stopped_or_moving, evasive_action, iv_action, iv_distance_out, iv_poi, iv_stopped_or_moving, saw_other_car, date_created, date_updated) VALUES
('backing', 'forward', 'quarter', 'rightSide', 'moving', '', 'backing', 'half', 'rightRearCorner', 'moving', 'no', '09-15-2020', '11-01-2020');
INSERT INTO backing_losses(accident_type, cv_action, cv_distance_out, cv_poi, cv_stopped_or_moving, evasive_action, iv_action, iv_distance_out, iv_poi, iv_stopped_or_moving, saw_other_car, date_created, date_updated) VALUES
('backing', 'backing', '3quarters', 'rightQuarter', 'stopped', 'no', 'forward', '', 'rightFrontCorner', 'moving', 'yes', '08-09-2020', '08-09-2020');

--rear end losses
INSERT INTO rear_end_losses(accident_type, number_of_cars, car_position, pushed, date_created, date_updated) VALUES
('rearEnd', '2', 'front', '', '01-16-2017', '03-01-2017');
INSERT INTO rear_end_losses(accident_type, number_of_cars, car_position, pushed, date_created, date_updated) VALUES
('rearEnd', '2', 'back', '', '05-12-2019', '07-12-2019');
INSERT INTO rear_end_losses(accident_type, number_of_cars, car_position, pushed, date_created, date_updated) VALUES
('rearEnd', '>2', 'middle', 'pushed', '02-20-2020', '02-20-2020');

--lane change losses

INSERT INTO lane_change_losses(accident_type, iv_action, cv_action, saw_other_car, evasive_action, iv_poi, cv_poi, date_created, date_updated) VALUES
('laneChange', 'straight', 'changing', 'yes', 'yes', 'leftFrontCorner', 'rightQuarter', '09-18-2016', '19-22-2016');
INSERT INTO lane_change_losses(accident_type, iv_action, cv_action, saw_other_car, evasive_action, iv_poi, cv_poi, date_created, date_updated) VALUES
('laneChange', 'changing', 'straight', 'no', '', 'leftSide', 'rightSide', '10-18-2017', '10-19-2017');
INSERT INTO lane_change_losses(accident_type, iv_action, cv_action, saw_other_car, evasive_action, iv_poi, cv_poi, date_created, date_updated) VALUES
('laneChange', 'changing', 'changing', 'no', '', 'leftSide', 'rightSide', '11-11-2011', '12-12-2012');