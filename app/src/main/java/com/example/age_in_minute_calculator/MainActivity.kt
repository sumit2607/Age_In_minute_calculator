package com.example.age_in_minute_calculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.age_in_minute_calculator.databinding.ActivityMainBinding
import com.google.android.material.datepicker.MaterialDatePicker.Builder.datePicker





class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var curDate: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        getTextFromCalender()


    }

    private fun getTextFromCalender() {

        with(binding) {
            val day: Int = calendarView.dayOfMonth
            val month: Int = calendarView.month + 1
            val year: Int = calendarView.year

//            curDate = dayOfMonth.toString() + month.toString() + year.toString()
//                Log.d("TAG", "onCreate: " + curDate)
//                textView2.text = curDate
            }
        }
    }
