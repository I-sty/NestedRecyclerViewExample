package com.example.isti.nestedrecyclerviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.isti.nestedrecyclerviewexample.data.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val items: ArrayList<PrimaryRecyclerViewData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItems()
        my_recycler_view.adapter = PrimaryRecyclerViewAdapter(items)
    }

    private fun addItems() {
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D3500", 489.42f,
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .ENTRY_LEVEL, IsoData.ISO_100, IsoData.ISO_25600, 24.4f, 11)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D5600", 590.55f,
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .UPPER_ENTRY, IsoData.ISO_100, IsoData.ISO_25600, 24.2f, 39)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D7500", 775.19f,
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .MID_RANGE, IsoData.ISO_100, IsoData.ISO_51200, 20.9f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D750", 1265.75f,
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .HIGH_END, IsoData.ISO_100, IsoData.ISO_12800, 24.3f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D610", 853.95f,
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .ADVANCED, IsoData.ISO_100, IsoData.ISO_25600, 24.2f, 39)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D850", 2755.37f,
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .HIGH_END, IsoData.ISO_64, IsoData.ISO_25600, 45.7f, 153)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D5", 4656.21f,
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .PROFESSIONAL, IsoData.ISO_100, IsoData.ISO_102400, 20.8f, 153)))
        items.add(PrimaryRecyclerViewData(BrandData.Canon, "R", 2060.00f,
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.MIRRORLESS,
                        CategoryType.HIGH_END, IsoData.ISO_50, IsoData.ISO_102400, 30.3f, 5655)))
    }
}
