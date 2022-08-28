package com.haeji.common

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class Quiz : AppCompatActivity(), View.OnClickListener {

    var mCurrentPosition : Int = 1 //첫질문
    var mQuestionList : ArrayList<TestData>? = null //질문목록을 설정하기 위해 사용할 수 있는 개체가 필요
    var mSelectedOptionPosition : Int = 0 //현재선택한값체크
    var mCorrectAnswers : Int = 0 //정답개수
    var mUserName: String? = null //사용자



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val tv_question : ImageView = findViewById(R.id.quiz_img)
        val option1 : TextView = findViewById(R.id.textView4)
        val option2 : TextView = findViewById(R.id.textView5)
        val option3 : TextView = findViewById(R.id.textView6)

        val btn_submit : TextView = findViewById(R.id.btn_submit)

        mQuestionList = Constants.getQuestions() //전체프로젝트범위에 속하지못함 그래서 위에설정

        setQuestion()

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        btn_submit.setOnClickListener(this)


    }

    private fun setQuestion() {
        val question = mQuestionList!![mCurrentPosition - 1]
        val tv_question : ImageView = findViewById(R.id.quiz_img)
        val option1 : TextView = findViewById(R.id.textView4)
        val option2 : TextView = findViewById(R.id.textView5)
        val option3 : TextView = findViewById(R.id.textView6)
        val btn_submit : TextView = findViewById(R.id.btn_submit)

        //현재위치-1을 뺀 질문목록이 할당한질문nullable유형이될것이므로 리스트의 인덱스 처음은 0이니까 -1한듯 문제의id=1이지만 인덱스는 0
        defaultOptionsView() //질문을 새로 설정할때마다 기본 옵션보기를 설정
        if (mCurrentPosition == mQuestionList!!.size) {
            //문제를 출력할 때 지금이 size의 끝이라면 FINISH로 할당
            btn_submit.text = "끝"
        } else { //다음 문제가 더 있다면 submit
            btn_submit.text = "확인"
        }



        tv_question.setImageResource(question.question)
        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree


    }
    private fun defaultOptionsView() {
        val tv_question : ImageView = findViewById(R.id.quiz_img)
        val option1 : TextView = findViewById(R.id.textView4)
        val option2 : TextView = findViewById(R.id.textView5)
        val option3 : TextView = findViewById(R.id.textView6)

        val btn_submit : TextView = findViewById(R.id.btn_submit)
        val options = ArrayList<TextView>()//ui보기요소
        options.add(0, option1)
        options.add(1,option2)
        options.add(2,option3)

        //사용자 인터페이스에 만든 드로어블 버튼테두리 색칠에 대해 기본 ui를 할당하는 for루프 만듦
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            //drawable을 사용하기 위해 contextcompat사용함
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(tv:TextView,selectedOptionNum : Int) {
        //올바른 선택을 위해 어떤 옵션이 선택되었는지 알아야함
        //여기서 우리가 할 일은 기본 옵션 보기를 설정하여 모든 옵션을 기본값으로 설정하는 것
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum //현재선택한 옵션이 패러미터의 옵션
        //선택한 옵션이 여기에서 선택한 옵션 번호가 새로 선택된 옵션 위치가 된다
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD) //텍스트 굵게 설정
        //drawable을 사용하기 위해 contextcompat사용함
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg //선택된 border로 변경
        )
    }

    private fun answerView(answer: Int, drawalbeView:Int) { //답변보기기능
        val option1 : TextView = findViewById(R.id.textView4)
        val option2 : TextView = findViewById(R.id.textView5)
        val option3 : TextView = findViewById(R.id.textView6)

        when(answer) {
            1-> {
                option1.background = ContextCompat.getDrawable(
                    this, drawalbeView
                )
            }
            2-> {
                option2.background = ContextCompat.getDrawable(
                    this, drawalbeView
                )
            }
            3-> {
                option3.background = ContextCompat.getDrawable(
                    this, drawalbeView
                )
            }

        }
    }

    override fun onClick(v: View?) { //메서드의 멤버 구현 선택하고 테두리를 볼 수 있도록 구현
        val option1 : TextView = findViewById(R.id.textView4)
        val option2 : TextView = findViewById(R.id.textView5)
        val option3 : TextView = findViewById(R.id.textView6)
        val btn_submit : TextView = findViewById(R.id.btn_submit)

        when(v?.id) {
            R.id.textView4 -> {
                selectedOptionView(option1,1) //num을 아래 함수에 넘겨줌
                //activity quiz question xml에 id가 tv option one인 textview를 함수에 직접전달됨
            }
            R.id.textView5 -> {
                selectedOptionView(option2,2) //num을 아래 함수에 넘겨줌
                //activity quiz question xml에 id가 tv option two인 textview를 함수에 직접전달됨
            }
            R.id.textView6 -> {
                selectedOptionView(option3,3) //num을 아래 함수에 넘겨줌
                //activity quiz question xml에 id가 tv option three인 textview를 함수에 직접전달됨
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) { //선택한 옵션위치가 0인 상황에서는 다음위치로 이동
                    mCurrentPosition += 1

                    when{
                        mCurrentPosition <= mQuestionList!!.size -> {

                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, MainActivity::class.java) //이름값을 result에 넘겨줌
                            intent.putExtra(Constants.USER_NAME, mUserName)//액티비티간 값을 넘겨줄때 사용
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    //리스트에 있는 문제들의 data를 가져와서 data의 correctAnswer값이
                    //고른 옵션 위치와 같다면 초록 아니면 빨간색을 answerView함수를 통해 할당한다
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswers += 1 //정답일경우 추가
                        Log.d("답 확인", mCorrectAnswers.toString())
                    }
                    answerView(question!!.correctAnswer, R.drawable.correct_option_border_bg)

                    //정답은 어떤 경우에도 녹색
                    //else에 묶이면 틀릴 경우 초록이 빨강과 같이 출력되지 않음을 방지하기위해 else는 안씀

                    if (mCurrentPosition == mQuestionList!!.size) {
                        //선택한 후 다음 질문으로 넘어갈때 size에 끝이라면 FINISH로 치환
                        btn_submit.text = "끝내기"
                    } else {
                        btn_submit.text = "다음으로 넘어가기"
                    }
                    //when에서 문제를 생성하기에 여기서 초기화
                    //선택한 옵션위치를 다시 0으로 초기화
                    mSelectedOptionPosition = 0
                }

            }
        }
    }


}