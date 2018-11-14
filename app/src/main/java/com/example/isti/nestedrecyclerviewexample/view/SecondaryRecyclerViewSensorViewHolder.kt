package com.example.isti.nestedrecyclerviewexample.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Switch
import android.widget.TextView
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey
import com.example.isti.nestedrecyclerviewexample.data.SensorType

/**
 * Created by István Szőllősi on 11/13/2018.
 */
class SecondaryRecyclerViewSensorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var label: TextView = itemView.findViewById(R.id.secondary_recycler_view_item_sensor_type_label)
    private var switch: Switch = itemView.findViewById(R.id.secondary_recycler_view_item_sensor_type_switch)

    fun bind(dataKey: SecondaryRecyclerViewDataKey) {
        label.text = dataKey.label
        switch.isChecked = dataKey.value == SensorType.FULL_FRAME.name
    }

}
