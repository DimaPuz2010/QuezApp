package com.nikolai.quizappevenying.helpers

import com.nikolai.quizappevenying.model.Answer
import com.nikolai.quizappevenying.model.Question
import com.nikolai.quizappevenying.model.Test

var answer1 = Answer(
    isCorrect = false,
    text = "Треугольник"
)
var answer2 = Answer(
    isCorrect = true,
    text = "Круг"
)
var answer3 = Answer(
    isCorrect = false,
    text = "Квадрат"
)

var question1 = Question(
    text = "Фигура в котоой нет кругов",
    answers = listOf(answer1, answer2, answer3)
)
////////////////////////////////
var question2 = Question(
    text = "Что вы будете делать есле у вас будут лимоны?",
    answers = listOf(
        Answer(
            isCorrect = false,
            text = "Сделать лимонад"
        ),
        Answer(
            isCorrect = false,
            text = "Продать лимоны"
        ),
        Answer(
            isCorrect = true,
            text = "Сжечь ваш дом до тла"
        )
    )
)
////////////////////////////////
var question3 = Question(
    text = "",
    answers = listOf(
        Answer(
            isCorrect = true,
            text = ""
        ),
        Answer(
            isCorrect = true,
            text = " "
        ),
        Answer(
            isCorrect = true,
            text = "  "
        )
    )
)
////////////////////////////////

val testException = Test(
    score = 0,
    question = listOf(question1, question2, question3)
)