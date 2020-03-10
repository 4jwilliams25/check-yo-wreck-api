package com.example.check_yo_wreck_api.LaneChangeLosses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaneChangeService {

    @Autowired
    private final LaneChangeRepository laneChangeRepository;

    public LaneChangeService(LaneChangeRepository laneChangeRepository) { this.laneChangeRepository = laneChangeRepository; }

    public List<LaneChangeLoss> getAllLosses() { return laneChangeRepository.findAll(); }

    public Optional<LaneChangeLoss> getOneLoss(int id) { return laneChangeRepository.findById(id); }

    public LaneChangeLoss addOneLoss(LaneChangeLoss newLoss) { return laneChangeRepository.save(newLoss); }

    public LaneChangeLoss updateOneLoss(LaneChangeLoss updatedLoss) { return laneChangeRepository.save(updatedLoss); }

    public Optional removeOneLoss(int id) {
        Optional deletedLoss = laneChangeRepository.findById(id);
        laneChangeRepository.deleteById(id);
        return deletedLoss;
    }
}
