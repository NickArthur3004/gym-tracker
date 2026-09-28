package com.nicolas.workout_gym_tracker.controller.dto;

import com.nicolas.workout_gym_tracker.model.enums.MuscleGroup;

public record CreateExerciseRequest(String name,
                                    MuscleGroup muscleGroup,
                                    String description) {}
