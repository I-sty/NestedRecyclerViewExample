package com.example.isti.nestedrecyclerviewexample.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey

class SecondaryRecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var value: TextView = itemView.findViewById(R.id.secondary_recycler_view_item_value)
    private var label: TextView = itemView.findViewById(R.id.secondary_recycler_view_item_label)

    fun bind(specs: SecondaryRecyclerViewDataKey) {
        value.text = specs.value
        label.text = specs.label
    }

}
