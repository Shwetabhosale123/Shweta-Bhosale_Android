package com.example.shwetabhosale_android.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.shwetabhosale_android.adapter.FlowerAdapter
import com.example.shwetabhosale_android.databinding.FragmentFlowerListBinding
import com.example.shwetabhosale_android.viewmodel.FlowerViewModel

class FlowerListFragment : Fragment() {
    private lateinit var flowerViewModel: FlowerViewModel
    private lateinit var flowerAdapter: FlowerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFlowerListBinding.inflate(inflater, container, false)
        flowerViewModel = ViewModelProvider(this).get(FlowerViewModel::class.java)
        flowerAdapter = FlowerAdapter { flower ->
            val action = FlowerListFragmentDirections.actionFlowerListFragmentToFlowerDetailFragment(flower)
            findNavController().navigate(action)
        }
        binding.recyclerView.adapter = flowerAdapter

        flowerViewModel.flowers.observe(viewLifecycleOwner, Observer {
            flowerAdapter.submitList(it)
        })

        flowerViewModel.getFlowers()

        return binding.root
    }
}

private fun NavController.navigate(action: Any) {
    TODO("Not yet implemented")
}
