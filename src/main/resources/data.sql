--backing losses
INSERT INTO backing_losses(cv_action, cv_distance_out, cv_poi, cv_stopped_or_moving, evasive_action, iv_action, iv_distance_out, iv_poi, iv_stopped_or_moving, saw_other_car) VALUES
('backing', 'half', 'rearBumper', 'moving', '', 'forward', '', 'rightFender', 'moving', 'no');
INSERT INTO backing_losses(cv_action, cv_distance_out, cv_poi, cv_stopped_or_moving, evasive_action, iv_action, iv_distance_out, iv_poi, iv_stopped_or_moving, saw_other_car) VALUES
('forward', 'quarter', 'rightSide', 'moving', '', 'backing', 'half', 'rightRearCorner', 'moving', 'no');
INSERT INTO backing_losses(cv_action, cv_distance_out, cv_poi, cv_stopped_or_moving, evasive_action, iv_action, iv_distance_out, iv_poi, iv_stopped_or_moving, saw_other_car) VALUES
('backing', '3quarters', 'rightQuarter', 'stopped', 'no', 'forward', '', 'rightFrontCorner', 'moving', 'yes');

--rear end losses
INSERT INTO rear_end_losses(number_of_cars, car_position, pushed) VALUES
('2', 'front', '');
INSERT INTO rear_end_losses(number_of_cars, car_position, pushed) VALUES
('2', 'back', '');
INSERT INTO rear_end_losses(number_of_cars, car_position, pushed) VALUES
('>2', 'middle', 'pushed');

--lane change losses

INSERT INTO lane_change_losses(iv_action, cv_action, saw_other_car, evasive_action, iv_poi, cv_poi) VALUES
('straight', 'changing', 'yes', 'yes', 'leftFrontCorner', 'rightQuarter');
INSERT INTO lane_change_losses(iv_action, cv_action, saw_other_car, evasive_action, iv_poi, cv_poi) VALUES
('changing', 'straight', 'no', '', 'leftSide', 'rightSide');
INSERT INTO lane_change_losses(iv_action, cv_action, saw_other_car, evasive_action, iv_poi, cv_poi) VALUES
('changing', 'changing', 'no', '', 'leftSide', 'rightSide');