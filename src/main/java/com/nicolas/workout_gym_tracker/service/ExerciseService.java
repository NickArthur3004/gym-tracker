package com.nicolas.workout_gym_tracker.service;

import com.nicolas.workout_gym_tracker.controller.dto.CreateExerciseRequest;

public interface ExerciseService {

    String createExecise(CreateExerciseRequest request);
}
