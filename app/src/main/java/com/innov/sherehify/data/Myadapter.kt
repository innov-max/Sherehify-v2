package com.innov.sherehify.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.innov.sherehify.R

class Myadapter (private val trendingList : ArrayList<Trending>):RecyclerView.Adapter<Myadapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_tem,parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return trendingList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = trendingList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvheading)

    }
}