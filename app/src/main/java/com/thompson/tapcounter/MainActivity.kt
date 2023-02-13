package com.thompson.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Did with with the help of Dr. Bateman's Week 3 Overview
    // NOTE: I tried to use binding and even tried to enable it in gradle, but I couldn't find a solution where ActivityMainBinding wasn't an unresolved reference
    //private lateinit var binding: ActivityMainBinding //Had to google unresolved reference ActivityMainBinding

    // MODEL
    // Counter and Button declarations
    private lateinit var count: Counter
    private lateinit var countButton: Button

    // VIEW
    // Declare and initialize displayCount as type TextView
    private var displayCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)

        count = Counter()                       // call the counter
        displayCount = findViewById(R.id.count_TextView)
        countButton = findViewById(R.id.count_Button)

        countButton.setOnClickListener {
            count.addCount()            // originally count!!.addCount(), AS said the !! was unnecessary

            displayCount?.setText(count.getCount().toString())
        }


    }

}