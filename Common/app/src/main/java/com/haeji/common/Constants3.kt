package com.haeji.common

object Constants3 {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions() : ArrayList<TestData> { //질문배열목록을 반환해야함
        val questionsList = ArrayList<TestData>()
        val que1 = TestData(
            1,
            R.drawable.quiz3_1, //문제
            "괴물",
            "터미네이터",
            "도둑들",
            2
        )
        questionsList.add(que1)

        val que2 = TestData(
            1,
            R.drawable.quiz3_2, //문제
            "천국의 계단",
            "드림하이",
            "전원일기",
            1
        )
        questionsList.add(que2)

        val que3 = TestData(
            1,
            R.drawable.quiz3_3, //문제
            "악마",
            "사탄",
            "천사",
            2
        )
        questionsList.add(que3)

        val que4 = TestData(
            1,
            R.drawable.quiz3_4, //문제
            "태양의 후예- 나 지금 떨고 있니?",
            "겨울연가- 사랑은 돌아오는거야!",
            "드림하이- 농약같은 가시나",
            1
        )
        questionsList.add(que4)

        val que5 = TestData(
            1,
            R.drawable.quiz3_5, //문제
            "스타워즈",
            "ET",
            "인터스텔라",
            3
        )
        questionsList.add(que5)

        return questionsList

    }
}
