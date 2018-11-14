package com.example.isti.nestedrecyclerviewexample.controller

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.data.PrimaryRecyclerViewData
import com.example.isti.nestedrecyclerviewexample.view.PrimaryRecyclerViewViewHolder

class PrimaryRecyclerViewAdapter(private val items: ArrayList<PrimaryRecyclerViewData>, private val secondaryRecyclerViewPool:
RecyclerView.RecycledViewPool) :
        RecyclerView
        .Adapter<PrimaryRecyclerViewViewHolder>() {
    override fun onBindViewHolder(holder: PrimaryRecyclerViewViewHolder, position: Int) {
        System.out.println("[Primary - onBindViewHolder]")
        holder
                .bind(holder.label.context, items[position], secondaryRecyclerViewPool)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrimaryRecyclerViewViewHolder {
        System.out.println("[Primary - onCreateViewHolder] viewType: $viewType")
        return PrimaryRecyclerViewViewHolder(LayoutInflater.from(parent.context).inflate(R.layout
                .primary_recyclerview_item, parent, false))

    }


    override fun getItemCount(): Int {
        return items.size
    }
}
