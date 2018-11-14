package com.example.isti.nestedrecyclerviewexample.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryViewTypes

/**
 * Created by István Szőllősi on 11/14/2018.
 */
class ViewHolderFactory {
    fun getViewHolder(viewType: SecondaryViewTypes?, parent: ViewGroup): RecyclerView.ViewHolder {
        return when (viewType) {
            SecondaryViewTypes.NORMAL -> SecondaryRecyclerViewViewHolder(LayoutInflater
                    .from(parent.context).inflate(R.layout.secondary_recyclerview_item_simple, parent, false))
            SecondaryViewTypes.SENSOR -> SecondaryRecyclerViewSensorViewHolder(LayoutInflater
                    .from(parent.context).inflate(R.layout.secondary_recyclerview_item_sensor_type, parent, false))
            SecondaryViewTypes.CAMERA -> SecondaryRecyclerViewCameraViewHolder(LayoutInflater
                    .from(parent.context).inflate(R.layout.secondary_recyclerview_item_camera_type, parent, false))
            null -> TODO()
        }
    }
}
