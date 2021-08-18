package com.example.foodcate

//outFood3Review 레이아웃 페이지랑 연결됨(각 후기 아이템)

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import org.techtown.sungshin3f.databinding.Outfood3reviewBinding

class outFood3ReviewAdapter : RecyclerView.Adapter<outFood3ReviewAdapter.ViewHolder>() {

    var items = ArrayList<outFood3Review>()

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = Outfood3reviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    inner class ViewHolder(val binding:Outfood3reviewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setItem(item: outFood3Review) {
            binding.outFood3ReviewName.text = item.name
            binding.outFoodStarInput.rating = item.rating.toFloat()?:0.0f
            binding.outFood3Review.text = item.contents
        }
    }

}