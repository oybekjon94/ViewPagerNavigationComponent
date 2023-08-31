package com.example.viewpagers

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomViewAdapter(activity: FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
         return 10
    }

    override fun createFragment(position: Int): Fragment {
         return SampleFragment().apply {
             arguments?.apply {
                 putString("key",position.toString())
             }
         }
    }
}