package org.techtown.sungshin3f


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.techtown.sungshin3f.databinding.VideoRowBinding

class InFoodAdapter()
    :RecyclerView.Adapter<InFoodAdapter.ViewHolder>(){
    val items=ArrayList<Food>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding= VideoRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)

    }
    override fun getItemCount()=items.size

    override fun onBindViewHolder(holder: InFoodAdapter.ViewHolder, position: Int) {
        val item=items[position]
        holder.setItem(item)
    }

    inner class ViewHolder(val binding:VideoRowBinding)
        :RecyclerView.ViewHolder(binding.root) {
        fun setItem(item: Food) {
            binding.videotitle.text = item.title
            Glide.with(itemView.context).load(item.thumbnail).into(binding.thumnailimg)
            binding.thumnailimg.setOnClickListener {
                var intent= Intent(itemView.getContext(),Youtubeplayer::class.java)
                intent.putExtra("video",item.videocode)
                itemView.getContext().startActivity(intent)
            }

        }
    }

}
