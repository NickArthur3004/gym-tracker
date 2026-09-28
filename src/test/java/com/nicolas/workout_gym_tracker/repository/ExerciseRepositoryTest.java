package com.nicolas.workout_gym_tracker.repository;

import com.nicolas.workout_gym_tracker.entity.Exercise;
import com.nicolas.workout_gym_tracker.entity.enums.MuscleGroup;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ExerciseRepositoryTest {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Test
    void saveExercise() {
        Exercise exercise = new Exercise(
                "Supino",
                MuscleGroup.PEITO,
                "Exercicio para peito"
        );

        Exercise exerciseSaved = exerciseRepository.save(exercise);

        assertNotNull(exerciseSaved.getId());
        assertEquals(exercise.getName(), exerciseSaved.getName());
    }
}
