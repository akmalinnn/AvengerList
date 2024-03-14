package com.akmalin.avengerlist.presentation.avengerlist.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.akmalin.avengerlist.base.ViewHolderBinder
import com.akmalin.avengerlist.data.model.Avenger

class AvengersAdapter: RecyclerView.Adapter<ViewHolder>() {

    private var asyncDataDiffer = AsyncListDiffer(
        this, object : DiffUtil.ItemCallback<Avenger>(){
            override fun areItemsTheSame(oldItem: Avenger, newItem: Avenger): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Avenger, newItem: Avenger): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }
        }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = asyncDataDiffer.currentList.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder !is ViewHolderBinder<*>) return
        (holder as ViewHolderBinder<Avenger>).bind(asyncDataDiffer.currentList[position])

    }
}