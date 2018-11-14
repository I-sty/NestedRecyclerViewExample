package com.example.isti.nestedrecyclerviewexample.view

import android.content.Context
import android.support.annotation.NonNull
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.isti.nestedrecyclerviewexample.MainActivity
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryRecyclerViewAdapter
import com.example.isti.nestedrecyclerviewexample.data.BrandData
import com.example.isti.nestedrecyclerviewexample.data.PrimaryRecyclerViewData
import java.util.*
import kotlin.random.Random

class PrimaryRecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val sdf = java.text.SimpleDateFormat("MMMM yyyy", Locale.getDefault())
    internal var label: TextView = itemView.findViewById(R.id.primary_recycler_view_item_label)
    private var logo: ImageView = itemView.findViewById(R.id.primary_recyclerview_item_image_image)
    private var price: TextView = itemView.findViewById(R.id.primary_recycler_view_item_value_price)
    private var announcedDate: TextView = itemView.findViewById(R.id.primary_recycler_view_item_value_announced_date)
    private var secondaryRecyclerView: RecyclerView = itemView.findViewById(R.id
            .secondary_recycler_view)
    private var ratingBar: RatingBar = itemView.findViewById(R.id.primary_recycler_view_item_bar_rating)

    fun bind(@NonNull context: Context, item: PrimaryRecyclerViewData, secondaryRecyclerViewPool: RecyclerView
    .RecycledViewPool) {
        label.text = item.brand.toString() + " " + item.model
        price.text = String.format(Locale.getDefault(), "$ %.2f", item.price)
        announcedDate.text = sdf.format(item.announced)
        ratingBar.rating = Random.nextDouble(0.toDouble(), 5.toDouble()).toFloat()
        val url: String = when (item.brand) {
            BrandData.Nikon -> "https://1.img-dpreview.com/files/p/articles/9317673667/nikonlogo.gif"
            BrandData.Canon -> "https://cdn.slidesharecdn.com/profile-photo-CanonBusinessUK-96x96.jpg?cb=1523510731"
            BrandData.Fujifilm -> "https://res-1.cloudinary.com/crunchbase-production/image/upload/c_lpad,h_120,w_120,f_auto,b_white,q_auto:eco/v1488698448/zolgfdueyohpxkvuotl7.png"
            BrandData.Sony -> "https://www.iconsdb.com/icons/download/navy-blue/sony-128.png"
            BrandData.Olympus -> "https://res-5.cloudinary.com/crunchbase-production/image/upload/c_lpad,h_120,w_120,f_auto,b_white,q_auto:eco/v1491746071/gjfvbhp74bp3eney4cui.png"
            BrandData.Pentax -> "https://www.graftek.biz/spree/taxons/297/normal/Pentax.jpg"
        }

        //GlideApp
        Glide.with(context).load(url).into(logo)

        secondaryRecyclerView.adapter = SecondaryRecyclerViewAdapter(item.getSpecsAsList(context))
        val layoutManger = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        if (MainActivity.OPTIMIZE) {
            layoutManger.recycleChildrenOnDetach = true
            secondaryRecyclerView.setRecycledViewPool(secondaryRecyclerViewPool)
        }

        secondaryRecyclerView.layoutManager = layoutManger
    }
}
