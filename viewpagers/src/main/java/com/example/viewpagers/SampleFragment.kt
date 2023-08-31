package com.example.viewpagers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagers.databinding.ActivityMainBinding
import com.example.viewpagers.databinding.SampleFragmentLayoutBinding

class SampleFragment():Fragment() {

    private var _binding:SampleFragmentLayoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SampleFragmentLayoutBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding  = null
    }
}