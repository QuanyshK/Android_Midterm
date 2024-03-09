package com.example.aviatickets.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.aviatickets.model.entity.Offer

class OfferDiffCallback(private val oldList: List<Offer>, private val newList: List<Offer>) : DiffUtil.ItemCallback<Offer>() {

    override fun areItemsTheSame(oldItem: Offer, newItem: Offer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Offer, newItem: Offer): Boolean {
        return oldItem.id == newItem.id &&
                oldItem.price == newItem.price &&
                oldItem.flight == newItem.flight

    }
}