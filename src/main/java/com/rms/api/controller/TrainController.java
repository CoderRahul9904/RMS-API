package com.rms.api.controller;

import com.rms.api.entity.Train;
import com.rms.api.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private final TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train) {
        return trainService.addTrain(train);
    }

    @GetMapping
    public List<Train> getAll() {
        return trainService.getAllTrains();
    }

    @PutMapping("/{id}")
    public Train update(@PathVariable Long id, @RequestBody Train train) {
        return trainService.updateTrain(id, train);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        trainService.deleteTrain(id);
    }

    @GetMapping("/search")
    public List<Train> search(@RequestParam String source,
                              @RequestParam String destination) {
        return trainService.searchTrain(source, destination);
    }
}