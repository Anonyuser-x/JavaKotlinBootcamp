package com.example.getir

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getir.databinding.ItemKampanyaBinding

class KampanyaSliderAdapter(private val kampanyaList: List<AppModel>) :
    RecyclerView.Adapter<KampanyaSliderAdapter.KampanyaViewHolder>() {

    inner class KampanyaViewHolder(val binding: ItemKampanyaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KampanyaViewHolder {
        val binding = ItemKampanyaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KampanyaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KampanyaViewHolder, position: Int) {
        val kampanya = kampanyaList[position]
        holder.binding.kampanyaTitle.text = kampanya.title
        holder.binding.kampanyaImage.setImageResource(kampanya.imageResId)
    }

    override fun getItemCount() = kampanyaList.size
}
