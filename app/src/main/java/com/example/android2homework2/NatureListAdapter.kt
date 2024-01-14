package com.example.android2homework2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2homework2.databinding.ItemNatureBinding

class NatureListAdapter() :
    RecyclerView.Adapter<NatureListAdapter.NatureViewHolder>() {

    private var natures = mutableListOf<Nature>()

    fun setNaturesList(nature: MutableList<Nature>) {
        natures = nature
        notifyDataSetChanged()
    }

    inner class NatureViewHolder(private val binding: ItemNatureBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(nature: Nature) = with(binding) {
            ivRamka.setImageResource(nature.natureImage)
            tvAbstract.text = nature.descriptionOfNature

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NatureViewHolder {
        val binding = ItemNatureBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NatureViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NatureViewHolder, position: Int) {
        holder.onBind(natures[position])
    }

    override fun getItemCount(): Int = natures.size
}