package com.techelevator.dao;

import com.techelevator.model.Question;

import java.util.List;

public interface QuestionDAO {
    List<Question> getAllQuestions();

    Question createQuestion(Question q);

    Question getRandomQuestion();
    boolean updateQuestion(Question q, int id);
    boolean deleteQuestion(int id);

    List<Question> filter(String title, String question);
}
