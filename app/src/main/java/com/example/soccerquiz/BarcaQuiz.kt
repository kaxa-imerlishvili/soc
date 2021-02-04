package com.example.soccerquiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class BarcaQuiz : AppCompatActivity(), View.OnClickListener {

    private var currentPosition:Int = 1
    private var selectedAnswer:Int = 0

    lateinit var questionList: ArrayList<BarcaQuestions>
    lateinit var questionArea: TextView
  lateinit  var firstAnswerArea: TextView
   lateinit var secondAnswerArea: TextView
   lateinit var thirdAnswerArea: TextView
   lateinit var fourthAnswerArea: TextView
   lateinit var answerButton:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barca_quiz)

            questionArea =  findViewById(R.id.question)
        firstAnswerArea = findViewById(R.id.first_answer)
        secondAnswerArea = findViewById(R.id.second_answer)
        thirdAnswerArea = findViewById(R.id.third_answer)
        fourthAnswerArea = findViewById(R.id.fourth_answer)
        answerButton = findViewById(R.id.answer_button)
         questionList = barcaData.getQuestions()

    setQuestions()

        firstAnswerArea.setOnClickListener(this)
        secondAnswerArea.setOnClickListener(this)
        thirdAnswerArea.setOnClickListener(this)
        fourthAnswerArea.setOnClickListener(this)
        answerButton.setOnClickListener(this)

    }

    private fun setQuestions(a: Int = 0){
        currentPosition +=a
        var barcaQuestion = questionList!!.get(currentPosition-1)

        if(currentPosition == questionList!!.size){
            answerButton.text = "Finish"
        }else answerButton.text = "Answer"

        questionArea.text = barcaQuestion.question
        firstAnswerArea.text = barcaQuestion.firstAnswer
        secondAnswerArea.text = barcaQuestion.secondAnswer
        thirdAnswerArea.text = barcaQuestion.thirdAnswer
        fourthAnswerArea.text = barcaQuestion.fourthAnswer
        defaultLook()
    }



    private fun defaultLook(){

        firstAnswerArea.setBackgroundColor(Color.parseColor("white"))
        secondAnswerArea.setBackgroundColor(Color.parseColor("white"))
        thirdAnswerArea.setBackgroundColor(Color.parseColor("white"))
        fourthAnswerArea.setBackgroundColor(Color.parseColor("white"))
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.first_answer -> {
                selectedAnswer(firstAnswerArea,1)
            }
            R.id.second_answer -> {
                selectedAnswer(secondAnswerArea,2)
            }
            R.id.third_answer -> {
                selectedAnswer(thirdAnswerArea,3)

            }
            R.id.fourth_answer -> {
                selectedAnswer(fourthAnswerArea,4)
            }
            R.id.answer_button ->{

                if (selectedAnswer == 0) {

                    currentPosition++

                    when {

                        currentPosition <= questionList!!.size -> {

                            setQuestions()
                        }
                        else -> {

                            Toast.makeText(this, "Test is Finished.", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    val question = questionList?.get(currentPosition - 1)

                    // This is to check if the answer is wrong
                    if (question!!.correctAnswer != selectedAnswer) {
                        answerSubmit(selectedAnswer, "red")
                    }


                    answerSubmit(question.correctAnswer, "green")

                    if (currentPosition == questionList!!.size) {
                        answerButton.text = "დასასრული"
                    } else {
                        answerButton.text = "შემდეგი შეკითხვა"
                    }

                    selectedAnswer = 0
                }
            }
        }
    }

    private fun selectedAnswer(tv: TextView, selectedAnswerNumber: Int){
        defaultLook()
    selectedAnswer = selectedAnswerNumber
        tv.setBackgroundColor(Color.parseColor("#17403E3E"))

    }

    private fun answerSubmit(answer:Int, color: String){
        when(answer){
            1-> firstAnswerArea.setBackgroundColor(Color.parseColor(color))
            2-> secondAnswerArea.setBackgroundColor(Color.parseColor(color))
            3-> thirdAnswerArea.setBackgroundColor(Color.parseColor(color))
            4-> fourthAnswerArea.setBackgroundColor(Color.parseColor(color))
        }
    }
}