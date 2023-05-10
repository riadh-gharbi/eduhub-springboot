package com.roky.thunderspi.controllers.riadh;


import com.roky.thunderspi.entities.Quiz;
import com.roky.thunderspi.services.riadh.IQuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {
    private final IQuizService quizService;


    @GetMapping
    public Set<Quiz> getAll()
    {
        return quizService.getAllQuiz().stream().collect(Collectors.toSet());
    }
    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable("id") Long id)
    {
        return quizService.getQuizById(id);
    }

    @PostMapping
    public Quiz addQuiz(@RequestBody Quiz q)
    {
        return quizService.addQuiz(q);
    }

    @PutMapping
    public Quiz updateQuiz(@RequestBody Quiz q)
    {
        return quizService.editQuiz(q);
    }

    @DeleteMapping("/del{id}")
    public void deleteQuiz(@PathVariable Long id)
    {
        quizService.deleteQuiz(id);
    }

    @GetMapping("/course/{id}")
    public Set<Quiz> getQuizByCourseId(@PathVariable("id") Long id)
    {
        return quizService.getQuizByCourseId(id);
    }

}
