package com.daviixo.test_dogs_api

import android.view.View
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import com.daviixo.test_dogs_api.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.ivDog)
        binding.ivDog

    }

}