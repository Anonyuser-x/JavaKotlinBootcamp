package com.example.getir

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getir.databinding.ItemAppBinding

class AppAdapter(private val appList: List<AppModel>) :
    RecyclerView.Adapter<AppAdapter.AppViewHolder>() {

    inner class AppViewHolder(val binding: ItemAppBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemAppBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AppViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val app = appList[position]
        holder.binding.filmBaslik.text = app.title
        holder.binding.filmImage.setImageResource(app.imageResId)
    }

    override fun getItemCount() = appList.size
}
