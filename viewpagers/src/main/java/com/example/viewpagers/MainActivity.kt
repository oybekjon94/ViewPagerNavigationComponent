package com.example.viewpagers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customViewPagerAdapter = CustomViewAdapter(this)
        binding.myViewPager.adapter = customViewPagerAdapter
    }
}