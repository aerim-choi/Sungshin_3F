package org.techtown.sungshin3f.outfood

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.techtown.sungshin3f.databinding.Outfood2ProfileBinding


class FoodAdapter() : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    var items = ArrayList<outfood2_profile>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =Outfood2ProfileBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }
    override fun getItemCount()= items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    inner class ViewHolder(val binding:Outfood2ProfileBinding)
        :RecyclerView.ViewHolder(binding.root){
            fun setItem(item: outfood2_profile){
                Glide.with(itemView.getContext()).load(item.thumnailurl).into(binding.outFood2Image)
                binding.outFoodName.text = item.name
                binding.outFoodLocation.text = item.locate
                binding.outFoodTime.text = item.time
                binding.outFoodStar.text = item.star
                binding.outFoodHeart.text = item.heart
                binding.outFood2Image.setOnClickListener {
                    var intent = Intent(itemView.getContext(), outFood3::class.java)
                    intent.putExtra("name",item.name)
                    intent.putExtra("address",item.locate)
                    intent.putExtra("time",item.time)
                    intent.putExtra("img1",item.img1)
                    intent.putExtra("img2",item.img2)
                    intent.putExtra("img3",item.img3)
                    intent.putExtra("type",item.type)
                    intent.putExtra("star",item.star)
                    intent.putExtra("heart",item.heart)
                    itemView.context.startActivity(intent)

                }
            }
            }
        }






