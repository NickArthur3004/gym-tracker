package com.nicolas.workout_gym_tracker.controller.mappers;

import com.nicolas.workout_gym_tracker.controller.dto.ExerciseResponse;
import com.nicolas.workout_gym_tracker.model.Exercise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {

    ExerciseResponse toExerciseResponse(Exercise exercise);
}
