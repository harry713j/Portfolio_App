package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val skillBtn = findViewById<Button>(R.id.skillsBtn)
        skillBtn.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        val workBtn = findViewById<Button>(R.id.workBtn)
        workBtn.setOnClickListener {
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }

        val achievementBtn = findViewById<Button>(R.id.achievementBtn)
        achievementBtn.setOnClickListener {
            intent = Intent(this, AchievementActivity::class.java)
            startActivity(intent)
        }
    }
}