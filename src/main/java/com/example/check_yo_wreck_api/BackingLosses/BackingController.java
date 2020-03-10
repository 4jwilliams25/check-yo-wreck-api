package com.example.check_yo_wreck_api.BackingLosses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/backing")
public class BackingController {

    @Autowired
    private final BackingService backingService;

    public BackingController(BackingService backingService) { this.backingService = backingService; }

    @GetMapping
    public List<BackingLoss> getAllLosses() { return this.backingService.getAllLosses(); }

    @GetMapping("/{id}")
    public BackingLoss getOneLoss(@PathVariable int id) {
        BackingLoss backingLoss = backingService.getOneLoss(id).orElseThrow(IllegalArgumentException::new);
        return backingLoss;
    }

    @PostMapping
    public BackingLoss addOneLoss(@RequestBody BackingLoss newLoss) { return backingService.addOneLoss(newLoss); }

    @PatchMapping
    public BackingLoss updateOneLoss(@RequestBody BackingLoss updatedLoss) {
        BackingLoss backingLoss = backingService.getOneLoss(updatedLoss.getId()).orElseThrow(IllegalArgumentException::new);
        return backingService.updateOneLoss(updatedLoss);
    }

    @DeleteMapping("/{id}")
    public Optional removeOneLoss(@PathVariable int id) {
        BackingLoss backingLoss = backingService.getOneLoss(id).orElseThrow(IllegalArgumentException::new);
        return backingService.removeOneLoss(id);
    }
}
