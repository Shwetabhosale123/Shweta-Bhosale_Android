package com.example.shwetabhosale_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shwetabhosale_android.databinding.ListItemFlowerBinding
import com.example.shwetabhosale_android.model.Flower

class FlowerAdapter(private val clickListener: (Flower) -> Unit) :
    ListAdapter<Flower, FlowerAdapter.FlowerViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val binding = ListItemFlowerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlowerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        val flower = getItem(position)
        holder.bind(flower, clickListener)
    }

    class FlowerViewHolder(private val binding: ListItemFlowerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(flower: Flower, clickListener: (Flower) -> Unit) {
           binding.flowerName
            binding.root.setOnClickListener {
                clickListener(flower)
            }
            binding.flowerName
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Flower>() {
        override fun areItemsTheSame(oldItem: Flower, newItem: Flower): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Flower, newItem: Flower): Boolean {
            return oldItem == newItem
        }
    }
}