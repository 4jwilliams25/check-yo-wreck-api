package com.example.check_yo_wreck_api.RearEndLosses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rearend")
public class RearEndController {

    @Autowired
    private final RearEndService rearEndService;

    public RearEndController(RearEndService rearEndService) { this.rearEndService = rearEndService; }

    @GetMapping
    public List<RearEndLoss> getAllLosses() { return rearEndService.getAllLosses(); }

    @GetMapping("/{id}")
    public RearEndLoss getOneLoss(@PathVariable int id) {
        RearEndLoss rearEndLoss = rearEndService.getOneLoss(id).orElseThrow(IllegalArgumentException::new);
        return rearEndLoss;
    }

    @PostMapping
    public RearEndLoss addOneLoss(@RequestBody RearEndLoss newLoss) { return rearEndService.addOneLoss(newLoss); }

    @PatchMapping
    public RearEndLoss updateOneLoss(@RequestBody RearEndLoss updatedLoss) {
        RearEndLoss rearEndLoss = rearEndService.getOneLoss(updatedLoss.getId()).orElseThrow(IllegalArgumentException::new);
        return rearEndService.updateOneLoss(updatedLoss);
    }

    @DeleteMapping("/{id}")
    public String removeOneLoss(@PathVariable int id) {
        RearEndLoss rearEndLoss = rearEndService.getOneLoss(id).orElseThrow(IllegalArgumentException::new);
        return rearEndService.removeOneLoss(id);
    }


}
