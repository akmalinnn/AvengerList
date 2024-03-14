package com.akmalin.avengerlist.presentation.avengerlist.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.akmalin.avengerlist.R
import com.akmalin.avengerlist.base.ViewHolderBinder
import com.akmalin.avengerlist.data.model.Avenger
import com.akmalin.avengerlist.databinding.ItemAvengerGridBinding

class AvengerGridItemViewHolder(
    private val binding: ItemAvengerGridBinding
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Avenger> {

    override fun bind(item: Avenger) {
        item.let {
            binding.ivAvengerPhoto.load(it.profilePictUrl){
                crossfade(true)
                error(R.mipmap.ic_launcher)
            }
            binding.tvAvengerName.text=it.name
        }
    }
}
