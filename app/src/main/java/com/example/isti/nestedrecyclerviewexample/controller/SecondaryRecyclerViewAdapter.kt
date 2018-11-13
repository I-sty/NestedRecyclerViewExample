package com.example.isti.nestedrecyclerviewexample.controller

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey
import com.example.isti.nestedrecyclerviewexample.view.SecondaryRecyclerViewViewHolder

class SecondaryRecyclerViewAdapter(var specs: ArrayList<SecondaryRecyclerViewDataKey>) :
        RecyclerView
        .Adapter<SecondaryRecyclerViewViewHolder>
        () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            SecondaryRecyclerViewViewHolder = SecondaryRecyclerViewViewHolder(LayoutInflater
            .from(parent.context).inflate(R.layout.secondary_recyclerview_item, parent, false))

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: SecondaryRecyclerViewViewHolder, position: Int) =
            holder.bind(specs[position])

}
