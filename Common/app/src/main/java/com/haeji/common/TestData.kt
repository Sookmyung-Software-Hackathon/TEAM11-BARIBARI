package com.haeji.common

data class TestData(
    val id: Int, //문제 번호
    val question: Int, //문제(이미지)
    val optionOne: String, //option은 객관식 답변들
    val optionTwo: String,
    val optionThree: String,
    val correctAnswer: Int //정답
)
