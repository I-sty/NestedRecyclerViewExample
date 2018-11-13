package com.example.isti.nestedrecyclerviewexample.view

import android.content.Context
import android.support.annotation.NonNull
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.isti.nestedrecyclerviewexample.PrimaryRecyclerViewData
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryRecyclerViewAdapter
import com.example.isti.nestedrecyclerviewexample.data.BrandData

class PrimaryRecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var label: TextView = itemView.findViewById(R.id.primary_recycler_view_item_label)
    var logo: ImageView = itemView.findViewById(R.id.primary_recyclerview_item_image_image)

    var secondaryRecyclerView: RecyclerView = itemView.findViewById(R.id.secondary_recycler_view)

    fun bind(@NonNull context: Context, item: PrimaryRecyclerViewData) {
        label.text = item.brand.toString() + " " + item.model
        val url: String = when (item.brand) {
            BrandData.Nikon -> "https://www.filecluster.com/media/icons/93772.gif"
            BrandData.Canon -> "http://www.download82.com/images/produse/iconuri/canon-pixma-mp160-all-in-one-driver.png"
            BrandData.Fujifilm -> TODO()
            BrandData.Sony -> TODO()
            BrandData.Olympus -> TODO()
            BrandData.Pentax -> TODO()
        }
        Glide.with(context).load(url).into(logo)
        secondaryRecyclerView.adapter = SecondaryRecyclerViewAdapter(item.getSpecsAsList(context))

    }

}
