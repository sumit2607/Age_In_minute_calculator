package com.example.age_in_minute_calculator

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.age_in_minute_calculator.databinding.ActivityMainBinding
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date


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
                textView2.text = curDate


                try {
                    val df: DateFormat = SimpleDateFormat("dd.MM.yyyy")
                    val date1: Date = Date()
                    val date2: Date = df.parse(curDate)
                    val diff: Long = date2.getTime() - date1.getTime()
                    Log.e(
                        "TEST",
                        (date1.getTime() + date2.getTime()).toString() + " - " + diff
                    )
                } catch (e: ParseException) {
                    Log.e("TEST", "Exception", e)
                }

            }
        }
    }
}