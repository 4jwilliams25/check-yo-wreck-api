package com.example.check_yo_wreck_api.LaneChangeLosses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/lanechange")
public class LaneChangeController {

    @Autowired
    private final LaneChangeService laneChangeService;

    public LaneChangeController(LaneChangeService laneChangeService) { this.laneChangeService = laneChangeService; }

    @GetMapping
    public List<LaneChangeLoss> getAllLosses() { return laneChangeService.getAllLosses(); }

    @GetMapping("/{id}")
    public LaneChangeLoss getOneLoss(@PathVariable int id) {
        LaneChangeLoss rearEndLoss = laneChangeService.getOneLoss(id).orElseThrow(IllegalArgumentException::new);
        return rearEndLoss;
    }

    @PostMapping
    public LaneChangeLoss addOneLoss(@RequestBody LaneChangeLoss newLoss) { return laneChangeService.addOneLoss(newLoss); }

    @PatchMapping
    public LaneChangeLoss updateOneLoss(@RequestBody LaneChangeLoss updatedLoss) {
        LaneChangeLoss rearEndLoss = laneChangeService.getOneLoss(updatedLoss.getId()).orElseThrow(IllegalArgumentException::new);
        return laneChangeService.updateOneLoss(updatedLoss);
    }

    @DeleteMapping("/{id}")
    public Optional removeOneLoss(@PathVariable int id) {
        LaneChangeLoss rearEndLoss = laneChangeService.getOneLoss(id).orElseThrow(IllegalArgumentException::new);
        return laneChangeService.removeOneLoss(id);
    }
}
