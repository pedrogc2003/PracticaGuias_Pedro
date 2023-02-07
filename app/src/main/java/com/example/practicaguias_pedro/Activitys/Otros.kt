package com.example.practicaguias_pedro.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicaguias_pedro.R
import com.example.practicaguias_pedro.databinding.ActivityOtrosBinding

class Otros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOtrosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}