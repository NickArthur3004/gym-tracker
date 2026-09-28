package com.nicolas.workout_gym_tracker.controller.dto;

import com.nicolas.workout_gym_tracker.model.enums.MuscleGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateExerciseRequest(@NotNull String name,
                                    @NotBlank MuscleGroup muscleGroup,
                                    String description) {}
