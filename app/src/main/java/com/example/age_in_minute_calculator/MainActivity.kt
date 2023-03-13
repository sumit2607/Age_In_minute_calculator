package com.example.age_in_minute_calculator

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.age_in_minute_calculator.databinding.ActivityMainBinding
import com.google.android.material.datepicker.MaterialDatePicker.Builder.datePicker
import java.text.SimpleDateFormat
import java.util.Locale


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var curDate: String = ""


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        getTextFromCalender()


    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getTextFromCalender() {

        with(binding) {
            calendarView.setOnDateChangedListener{ _, year, month, dayOfMonth ->
                curDate = dayOfMonth.toString() +"-"+ (month+1) +"-"+ year.toString()

                Log.e(
                    "TEST1",
                    (curDate)
                )
                val currentTime = System.currentTimeMillis()

                val sdf = SimpleDateFormat("dd/MM/yyyy" , Locale.ENGLISH)

                val theDate = sdf.parse(curDate)

                val   currentDAteInMin =   theDate.time / 6000

                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                val FinalDate =  currentDAteInMin - currentDate




            }
        }
    }
}