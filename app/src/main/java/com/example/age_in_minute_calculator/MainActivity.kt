package com.example.age_in_minute_calculator

import android.os.Bundle
import android.util.Log
import android.widget.CalendarView.OnDateChangeListener
import androidx.appcompat.app.AppCompatActivity
import com.example.age_in_minute_calculator.databinding.ActivityMainBinding
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
     private var  curDate :String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        getTextFromCalender()




    }

    private fun getTextFromCalender() {

        with(binding){
            calendarView.setOnDateChangeListener(OnDateChangeListener { view, year, month, dayOfMonth ->
                curDate = dayOfMonth.toString() + month.toString() + year.toString()

                Log.d("TAG", "onCreate: "  + curDate)



                textView2.text = curDate


            })
       }



    }
}