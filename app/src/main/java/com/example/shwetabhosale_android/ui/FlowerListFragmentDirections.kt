package com.example.shwetabhosale_android.ui

class FlowerListFragmentDirections {
    companion object {
        fun <Flower> actionFlowerListFragmentToFlowerDetailFragment(flower: Flower): Any {

            return flower.toString()
        }
    }

}
