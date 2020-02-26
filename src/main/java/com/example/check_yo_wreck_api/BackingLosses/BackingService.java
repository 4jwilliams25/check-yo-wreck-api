package com.example.check_yo_wreck_api.BackingLosses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BackingService {

    @Autowired
    private final BackingRepository backingRepository;

    public BackingService(BackingRepository backingRepository) {this.backingRepository = backingRepository;}

    public List<BackingLoss> getAllLosses() { return backingRepository.findAll(); }

    public Optional<BackingLoss> getOneLoss(int id) { return backingRepository.findById(id) ;}

    public BackingLoss addOneLoss(BackingLoss newLoss) { return backingRepository.save(newLoss); }

    public BackingLoss updateOneLoss(BackingLoss updatedLoss) { return backingRepository.save(updatedLoss); }

    public String removeOneLoss(int id) {
        backingRepository.deleteById(id);
        return "ID " + id + " was removed";
    }
}
