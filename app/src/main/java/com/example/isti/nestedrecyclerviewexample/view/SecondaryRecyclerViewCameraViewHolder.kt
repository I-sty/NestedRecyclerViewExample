package com.example.isti.nestedrecyclerviewexample.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.data.CameraType
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey

/**
 * Created by István Szőllősi on 11/13/2018.
 */
class SecondaryRecyclerViewCameraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var label: TextView = itemView.findViewById(R.id.secondary_recycler_view_item_camera_type_label)
    private var buttonStart: Button = itemView.findViewById(R.id.secondary_recycler_view_item_camera_type_button_start)
    private var buttonEnd: Button = itemView.findViewById(R.id.secondary_recycler_view_item_camera_type_button_end)

    fun bind(dataKey: SecondaryRecyclerViewDataKey) {
        label.text = dataKey.label
        val value: Boolean = dataKey.value != CameraType.DSLR.name
        buttonStart.isEnabled = !value
        buttonEnd.isEnabled = value

    }

}
