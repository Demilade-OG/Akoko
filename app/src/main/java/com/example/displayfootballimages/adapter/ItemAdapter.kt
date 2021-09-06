package com.example.displayfootballimages.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.displayfootballimages.R
import com.example.displayfootballimages.model.Images

class ItemAdapter (
        private val context: Context,
        private val dataset: List<Images>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()   {

    class ItemViewHolder (private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textView: TextView = view.findViewById(R.id.item_title)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val item = dataset[position]
        holder.textView.text = context.resources.getString(item.StringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val adapterLayout = LayoutInflater.from(parent.context)
               .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }


}