package com.example.shwetabhosale_android.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shwetabhosale_android.databinding.FragmentFlowerDetailBinding

class FlowerDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFlowerDetailBinding.inflate(inflater, container, false)
        val flower = FlowerDetailFragment.fromBundle(requireArguments())
        binding.flowerName
        return binding.root
    }

    companion object {
        fun fromBundle(requireArguments: Bundle): Any {
            TODO("Not yet implemented")
        }
    }
}