package com.nicolas.workout_gym_tracker.controller;

import com.nicolas.workout_gym_tracker.controller.dto.CreateExerciseRequest;
import com.nicolas.workout_gym_tracker.model.ErroResponse;
import com.nicolas.workout_gym_tracker.model.Exercise;
import com.nicolas.workout_gym_tracker.model.exception.ValidationException;
import com.nicolas.workout_gym_tracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execise")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;


    @PostMapping("/create")
    public ResponseEntity<Object> createExercise(@RequestBody CreateExerciseRequest request) {
        try {
            return ResponseEntity.ok(exerciseService.createExecise(request));
        } catch (ValidationException e) {
            var erro = new ErroResponse("Erro validação", e.getField(), e.getMessage());
            return ResponseEntity.badRequest().body(erro);
        }
    }
}
