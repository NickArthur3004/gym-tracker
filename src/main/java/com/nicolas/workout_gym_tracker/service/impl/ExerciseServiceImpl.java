package com.nicolas.workout_gym_tracker.service.impl;


import com.nicolas.workout_gym_tracker.controller.dto.CreateExerciseRequest;
import com.nicolas.workout_gym_tracker.model.Exercise;
import com.nicolas.workout_gym_tracker.model.exception.MuscleGroupInvalid;
import com.nicolas.workout_gym_tracker.repository.ExerciseRepository;
import com.nicolas.workout_gym_tracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    ExerciseRepository exerciseRepository;


    @Override
    public String createExecise(CreateExerciseRequest request) {

        if (request.muscleGroup() == null){
            throw new MuscleGroupInvalid("Muscle group is null");
        }
        saveNewExecise(request);
        return "Exercise saved!";
    }

    private void saveNewExecise(CreateExerciseRequest request) {
        Exercise exercise = new Exercise(request.name(), request.muscleGroup(), request.description());
        exerciseRepository.save(exercise);
    }
}
