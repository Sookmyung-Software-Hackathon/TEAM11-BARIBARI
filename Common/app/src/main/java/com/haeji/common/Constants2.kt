package com.haeji.common

object Constants2 {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions() : ArrayList<TestData> { //질문배열목록을 반환해야함
        val questionsList = ArrayList<TestData>()
        val que1 = TestData(
            1,
            R.drawable.quiz2_1, //문제
            "김광석 - 서른즈음에",
            "휘성 - 아이처럼",
            "에프엑스 - 첫사랑니",
            2
        )
        questionsList.add(que1)

        val que2 = TestData(
            1,
            R.drawable.quiz2_2, //문제
            "윤하",
            "씨스타",
            "양희은",
            1
        )
        questionsList.add(que2)

        val que3 = TestData(
            1,
            R.drawable.quiz2_3, //문제
            "해피",
            "심심해",
            "나이스",
            3
        )
        questionsList.add(que3)

        val que4 = TestData(
            1,
            R.drawable.quiz2_4, //문제
            "소녀시대",
            "자전거 탄 풍경",
            "브라운아이즈",
            3
        )
        questionsList.add(que4)

        val que5 = TestData(
            1,
            R.drawable.quiz2_5, //문제
            "왁스",
            "버즈",
            "데이식스",
            1
        )
        questionsList.add(que5)

        return questionsList

    }
}
