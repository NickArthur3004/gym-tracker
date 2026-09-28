package com.nicolas.workout_gym_tracker.service;

import com.nicolas.workout_gym_tracker.controller.dto.CreateExerciseRequest;
import com.nicolas.workout_gym_tracker.controller.dto.ExerciseResponse;

public interface ExerciseService {

    ExerciseResponse createExercise(CreateExerciseRequest request);
}
