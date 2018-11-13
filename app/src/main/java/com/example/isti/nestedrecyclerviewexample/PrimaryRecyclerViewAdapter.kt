package com.example.isti.nestedrecyclerviewexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.isti.nestedrecyclerviewexample.view.PrimaryRecyclerViewViewHolder

class PrimaryRecyclerViewAdapter(val items: ArrayList<PrimaryRecyclerViewData>) :
        RecyclerView
        .Adapter<PrimaryRecyclerViewViewHolder>() {
    override fun onBindViewHolder(holder: PrimaryRecyclerViewViewHolder, position: Int) = holder
            .bind(holder.label.context, items[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrimaryRecyclerViewViewHolder =
            PrimaryRecyclerViewViewHolder(LayoutInflater.from(parent.context).inflate(R.layout
                    .primary_recyclerview_item, parent, false))


    override fun getItemCount(): Int {
        return items.size
    }
}
