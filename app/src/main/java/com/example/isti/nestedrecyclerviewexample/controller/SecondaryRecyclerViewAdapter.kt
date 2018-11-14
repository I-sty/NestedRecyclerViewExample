package com.example.isti.nestedrecyclerviewexample.controller

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryViewTypes.*
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey
import com.example.isti.nestedrecyclerviewexample.view.SecondaryRecyclerViewCameraViewHolder
import com.example.isti.nestedrecyclerviewexample.view.SecondaryRecyclerViewSensorViewHolder
import com.example.isti.nestedrecyclerviewexample.view.SecondaryRecyclerViewViewHolder
import com.example.isti.nestedrecyclerviewexample.view.ViewHolderFactory

class SecondaryRecyclerViewAdapter(private var specs: ArrayList<SecondaryRecyclerViewDataKey>) :
        RecyclerView
        .Adapter<RecyclerView.ViewHolder>
        () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        System.out.println("[Secondary - onCreateViewHolder] viewType: $viewType")
        return ViewHolderFactory().getViewHolder(SecondaryViewTypes.values()[viewType], parent)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun getItemViewType(position: Int): Int {
        return specs[position].type.ordinal
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        System.out.println("[Secondary - onBindViewHolder]")
        when (values()[holder.itemViewType]) {
            NORMAL -> (holder as SecondaryRecyclerViewViewHolder).bind(specs[position])
            SENSOR -> (holder as SecondaryRecyclerViewSensorViewHolder).bind(specs[position])
            CAMERA -> (holder as SecondaryRecyclerViewCameraViewHolder).bind(specs[position])
        }
    }

}
