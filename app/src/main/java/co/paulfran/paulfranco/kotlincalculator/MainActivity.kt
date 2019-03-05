package co.paulfran.paulfranco.kotlincalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var number : String = ""
    var numberOne : Float = 0.0F
    var numberTwo : Float = 0.0F
    var isAddition : Boolean = false
    var isDivision : Boolean = false
    var isSubtraction : Boolean = false
    var isMultiplication : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunction(view: View) {
        var editText : EditText? = findViewById(R.id.edit_text)

        when(view.id) {
            R.id.button_zero -> {
                number += "0"
                editText?.setText(number)}

            R.id.button_one -> {
                number += "1"
                editText?.setText(number)}

            R.id.button_two -> {
                number += "2"
                editText?.setText(number)}

            R.id.button_three -> {
                number += "3"
                editText?.setText(number)}

            R.id.button_four -> {
                number += "4"
                editText?.setText(number)}

            R.id.button_five -> {
                number += "5"
                editText?.setText(number)}

            R.id.button_six -> {
                number += "6"
                editText?.setText(number)}

            R.id.button_seven -> {
                number += "7"
                editText?.setText(number)}

            R.id.button_eight -> {
                number += "8"
                editText?.setText(number)}

            R.id.button_nine -> {
                number += "9"
                editText?.setText(number)}

            R.id.button_clear -> {
                number = ""
                editText?.setText("")
            }

            R.id.button_dot -> {
                number += "."
                editText?.setText(number)
            }

            R.id.button_sum -> {
                if(number.isNullOrBlank()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isAddition = true
                    number = ""
                }
            }

            R.id.button_divide -> {
                if(number.isNullOrBlank()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isDivision = true
                    number = ""
                }
            }

            R.id.button_minus -> {
                if(number.isNullOrBlank()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isSubtraction = true
                    number = ""
                }
            }

            R.id.button_equals -> {
                if (isAddition == true){
                    numberTwo = number.toFloat()
                    editText?.setText((numberOne+numberTwo).toString())
                }else if(isDivision){
                    numberTwo = number.toFloat()
                    editText?.setText((numberOne/numberTwo).toString())
                }else if(isSubtraction){
                    numberTwo = number.toFloat()
                    editText?.setText((numberOne - numberTwo).toString())
                }else{
                    editText?.setText("")
                }
            }

        }
    }
}
