package com.example.classcatcl

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcActivity :AppCompatActivity() {
    var myAnswer: TextView ?= null
    var myFnum: TextView ?= null
    var mySnum: TextView ?= null
    var buttonAdd: Button ?= null
    var buttonSubtract: Button ?= null
    var buttonMultiply: Button ?= null
    var buttonDivide: Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        myAnswer = findViewById(R.id.myAnswer)
        myFnum = findViewById(R.id.mEdtFirst)
        mySnum = findViewById(R.id.mEdtSecond)
        buttonSubtract = findViewById(R.id.button)
        buttonAdd = findViewById(R.id.button2)
        buttonMultiply = findViewById(R.id.button3)
        buttonDivide = findViewById(R.id.button4)
        //set onclick listeners to button
        buttonAdd!!.setOnClickListener {
            //receive the numbers from the users
            var firstnumber = myFnum!!.text.toString().trim()
            var secondnumber = mySnum!!.text.toString().trim()
            //CHECK IF THE USER IS SUBMITTING EMPTY FIELDS
            if (firstnumber.isEmpty()){
                //set the first number to set text
                myFnum!!.setError("Please fill in this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                //set an error to the second number edit text
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //proceed to calculate the two numbers
                var answer = firstnumber.toDouble() + secondnumber.toDouble()
                //DISPLAY THE RESULT OF THE TEXT VIEW MYANSWER
                myAnswer!!.text = answer.toString()
            }
        }
        buttonSubtract!!.setOnClickListener {
            var firstnumber = myFnum!!.text.toString().trim()
            var secondnumber = mySnum!!.text.toString().trim()
            //CHECK IF THE USER IS SUBMITTING EMPTY FIELDS
            if (firstnumber.isEmpty()){
                //set the first number to set text
                myFnum!!.setError("Please fill in this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                //set an error to the second number edit text
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //proceed to calculate the two numbers
                var answer = firstnumber.toDouble() - secondnumber.toDouble()
                //DISPLAY THE RESULT OF THE TEXT VIEW MYANSWER
                myAnswer!!.text = answer.toString()
            }
        }
        buttonDivide!!.setOnClickListener {
            var firstnumber = myFnum!!.text.toString().trim()
            var secondnumber = mySnum!!.text.toString().trim()
            //CHECK IF THE USER IS SUBMITTING EMPTY FIELDS
            if (firstnumber.isEmpty()){
                //set the first number to set text
                myFnum!!.setError("Please fill in this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                //set an error to the second number edit text
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //proceed to calculate the two numbers
                var answer = firstnumber.toDouble() / secondnumber.toDouble()
                //DISPLAY THE RESULT OF THE TEXT VIEW MYANSWER
                myAnswer!!.text = answer.toString()
            }
        }
        buttonMultiply!!.setOnClickListener {
            var firstnumber = myFnum!!.text.toString().trim()
            var secondnumber = mySnum!!.text.toString().trim()
            //CHECK IF THE USER IS SUBMITTING EMPTY FIELDS
            if (firstnumber.isEmpty()){
                //set the first number to set text
                myFnum!!.setError("Please fill in this input")
                myFnum!!.requestFocus()
            }else if (secondnumber.isEmpty()){
                //set an error to the second number edit text
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //proceed to calculate the two numbers
                var answer = firstnumber.toDouble() * secondnumber.toDouble()
                //DISPLAY THE RESULT OF THE TEXT VIEW MYANSWER
                myAnswer!!.text = answer.toString()
            }
        }

    }
}