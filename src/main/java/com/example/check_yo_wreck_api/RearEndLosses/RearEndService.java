package com.example.check_yo_wreck_api.RearEndLosses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RearEndService {

    @Autowired
    private final RearEndRepository rearEndRepository;

    public RearEndService(RearEndRepository rearEndRepository) { this.rearEndRepository = rearEndRepository; }

    public List<RearEndLoss> getAllLosses() { return rearEndRepository.findAll(); }

    public Optional<RearEndLoss> getOneLoss(int id) { return rearEndRepository.findById(id); }

    public RearEndLoss addOneLoss(RearEndLoss newLoss) { return rearEndRepository.save(newLoss); }

    public RearEndLoss updateOneLoss(RearEndLoss updatedLoss) { return rearEndRepository.save(updatedLoss); }

    public String removeOneLoss(int id) {
        rearEndRepository.deleteById(id);
        return "ID " + id + " was removed";
    }
}
