package com.nicolas.workout_gym_tracker.service.impl;


import com.nicolas.workout_gym_tracker.controller.dto.CreateExerciseRequest;
import com.nicolas.workout_gym_tracker.controller.dto.ExerciseResponse;
import com.nicolas.workout_gym_tracker.controller.mappers.ExerciseMapper;
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

    private final ExerciseMapper exerciseMapper;

    public ExerciseServiceImpl(ExerciseMapper exerciseMapper) {
        this.exerciseMapper = exerciseMapper;
    }

    @Override
    public ExerciseResponse createExercise(CreateExerciseRequest request) {

        return exerciseMapper.toExerciseResponse(saveNewExercise(request));
    }

    private Exercise saveNewExercise(CreateExerciseRequest request) {
        Exercise exercise = new Exercise(request.name(), request.muscleGroup(), request.description());
        return exerciseRepository.save(exercise);
    }
}
