package com.haeji.common

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions() : ArrayList<TestData> { //질문배열목록을 반환해야함
        val questionsList = ArrayList<TestData>()
        val que1 = TestData(
            1,
            R.drawable.quiz1, //문제
            "왠지 열받는다",
            "웬일이야",
            "어쩐지 열심히 하더라",
            2
        )
        questionsList.add(que1)

        val que2 = TestData(
            1,
            R.drawable.quiz2, //문제
            "OTL",
            "좋댓구알",
            "야타족",
            1
        )
        questionsList.add(que2)

        val que3 = TestData(
            1,
            R.drawable.quiz3, //문제
            "982",
            "사바사",
            "갓생",
            3
        )
        questionsList.add(que3)

        val que4 = TestData(
            1,
            R.drawable.quiz4, //문제
            "룰라를 탈퇴했던 김지현을 의미",
            "의도치않은 말실수를 수습하려는 모습",
            "놀이기구 이름",
            2
        )
        questionsList.add(que4)

        val que5 = TestData(
            1,
            R.drawable.quiz5, //문제
            "9977-할 이야기가 많다",
            "486-사랑해",
            "2222-격한 공감(O)",
            3
        )
        questionsList.add(que5)

        return questionsList

    }
}
