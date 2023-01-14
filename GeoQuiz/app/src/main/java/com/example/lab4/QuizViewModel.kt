package com.example.lab4

import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {
    var currentIndex = 0

    private val questionBank = listOf(
        Question(R.string.questionAustralia, true),
        Question(R.string.questionOceans, true),
        Question(R.string.questionMideast, false),
        Question(R.string.questionAfrica, false),
        Question(R.string.questionAmericas, true),
        Question(R.string.questionAsia, true))

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].questionText

    fun nextQuestion() {
        currentIndex += 1
    }

    fun isEmptyQuestions() : Boolean {
        return currentIndex == questionBank.size
    }
}
