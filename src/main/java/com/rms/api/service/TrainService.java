package com.rms.api.service;

import com.rms.api.entity.Train;
import com.rms.api.repository.TrainRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train updateTrain(Long id, Train train) {
        Train t = trainRepository.findById(id).orElseThrow();
        t.setTrainName(train.getTrainName());
        t.setSource(train.getSource());
        t.setDestination(train.getDestination());
        t.setSeatsAvailable(train.getSeatsAvailable());
        return trainRepository.save(t);
    }

    public void deleteTrain(Long id) {
        trainRepository.deleteById(id);
    }

    public List<Train> searchTrain(String source, String destination) {
        return trainRepository.findBySourceAndDestination(source, destination);
    }
}