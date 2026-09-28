package com.nicolas.workout_gym_tracker.repository;

import com.nicolas.workout_gym_tracker.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
