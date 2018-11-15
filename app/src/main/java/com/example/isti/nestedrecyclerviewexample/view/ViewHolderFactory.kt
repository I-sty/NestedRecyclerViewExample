package com.example.isti.nestedrecyclerviewexample.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryViewTypes
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryViewTypes.*
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey

/**
 * Created by István Szőllősi on 11/14/2018.
 */
class ViewHolderFactory {
    fun getViewHolder(viewType: SecondaryViewTypes?, parent: ViewGroup): RecyclerView.ViewHolder {
        return when (viewType) {
            NORMAL -> SecondaryRecyclerViewViewHolder(LayoutInflater
                    .from(parent.context).inflate(R.layout.secondary_recyclerview_item_simple, parent, false))
            SENSOR -> SecondaryRecyclerViewSensorViewHolder(LayoutInflater
                    .from(parent.context).inflate(R.layout.secondary_recyclerview_item_sensor_type, parent, false))
            CAMERA -> SecondaryRecyclerViewCameraViewHolder(LayoutInflater
                    .from(parent.context).inflate(R.layout.secondary_recyclerview_item_camera_type, parent, false))
            null -> TODO()
        }
    }

    fun getViewHolderBind(holder: RecyclerView.ViewHolder, dataKey: SecondaryRecyclerViewDataKey) {
        when (SecondaryViewTypes.values()[holder.itemViewType]) {
            NORMAL -> (holder as SecondaryRecyclerViewViewHolder).bind(dataKey)
            SENSOR -> (holder as SecondaryRecyclerViewSensorViewHolder).bind(dataKey)
            CAMERA -> (holder as SecondaryRecyclerViewCameraViewHolder).bind(dataKey)
        }
    }
}
