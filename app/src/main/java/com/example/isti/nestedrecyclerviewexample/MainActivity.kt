package com.example.isti.nestedrecyclerviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.RecyclerView
import com.example.isti.nestedrecyclerviewexample.controller.PrimaryRecyclerViewAdapter
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryViewTypes
import com.example.isti.nestedrecyclerviewexample.data.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private val items: ArrayList<PrimaryRecyclerViewData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItems()
        val itemAnimator = DefaultItemAnimator()
        itemAnimator.addDuration = 1000
        itemAnimator.removeDuration = 1000
        my_recycler_view.itemAnimator = itemAnimator
        val secondaryRecyclerViewPool = RecyclerView.RecycledViewPool()


        secondaryRecyclerViewPool.setMaxRecycledViews(SecondaryViewTypes.NORMAL.ordinal, Companion.MAX_VIEWTYPES_IN_POOL)
        secondaryRecyclerViewPool.setMaxRecycledViews(SecondaryViewTypes.CAMERA.ordinal, Companion.MAX_VIEWTYPES_IN_POOL)
        secondaryRecyclerViewPool.setMaxRecycledViews(SecondaryViewTypes.SENSOR.ordinal, Companion.MAX_VIEWTYPES_IN_POOL)

        my_recycler_view.adapter = PrimaryRecyclerViewAdapter(items, secondaryRecyclerViewPool)
    }

    private var simpleDateFormatter: SimpleDateFormat = SimpleDateFormat("MM/yyyy", Locale.getDefault())

    private fun addItems() {
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D3500", 489.42f, simpleDateFormatter.parse("09/2018"),
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .ENTRY_LEVEL, IsoData.ISO_100, IsoData.ISO_25600, 24.4f, 11)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D5600", 590.55f, simpleDateFormatter.parse("11/2016"),
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .UPPER_ENTRY, IsoData.ISO_100, IsoData.ISO_25600, 24.2f, 39)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D7500", 775.19f, simpleDateFormatter.parse("04/2017"),
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .MID_RANGE, IsoData.ISO_100, IsoData.ISO_51200, 20.9f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D750", 1265.75f, simpleDateFormatter.parse("09/2014"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .HIGH_END, IsoData.ISO_100, IsoData.ISO_12800, 24.3f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D610", 853.95f, simpleDateFormatter.parse("10/2013"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .ADVANCED, IsoData.ISO_100, IsoData.ISO_25600, 24.2f, 39)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D850", 2755.37f, simpleDateFormatter.parse("07/2017"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .HIGH_END, IsoData.ISO_64, IsoData.ISO_25600, 45.7f, 153)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D5", 4656.21f, simpleDateFormatter.parse("01/2016"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .PROFESSIONAL, IsoData.ISO_100, IsoData.ISO_102400, 20.8f, 153)))
        items.add(PrimaryRecyclerViewData(BrandData.Canon, "R", 2060.00f, simpleDateFormatter.parse
        ("09/2018"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.MIRRORLESS,
                        CategoryType.HIGH_END, IsoData.ISO_50, IsoData.ISO_102400, 30.3f, 5655)))


        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D3400", 319.42f, simpleDateFormatter.parse("08/2016"),
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .ENTRY_LEVEL, IsoData.ISO_100, IsoData.ISO_25600, 24f, 11)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D5500", 499.55f, simpleDateFormatter.parse("01/2015"),
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .UPPER_ENTRY, IsoData.ISO_100, IsoData.ISO_25600, 24f, 39)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D7200", 769.19f, simpleDateFormatter.parse("03/2015"),
                SecondaryRecyclerViewData(SensorType.APS_C, CameraType.DSLR, CategoryType
                        .MID_RANGE, IsoData.ISO_100, IsoData.ISO_25600, 24f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D700", 1580.99f, simpleDateFormatter.parse("08/2008"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .HIGH_END, IsoData.ISO_100, IsoData.ISO_25600, 12.1f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D600", 1488.69f, simpleDateFormatter.parse("5/2012"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .ADVANCED, IsoData.ISO_100, IsoData.ISO_25600, 24.2f, 39)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D810", 1789.99f, simpleDateFormatter.parse("07/2014"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .HIGH_END, IsoData.ISO_64, IsoData.ISO_12800, 36.2f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Nikon, "D4", 5574.59f, simpleDateFormatter.parse("01/2012"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR, CategoryType
                        .PROFESSIONAL, IsoData.ISO_100, IsoData.ISO_12800, 16.2f, 51)))
        items.add(PrimaryRecyclerViewData(BrandData.Canon, "5D Mark IV", 2245.00f, simpleDateFormatter.parse
        ("08/2016"),
                SecondaryRecyclerViewData(SensorType.FULL_FRAME, CameraType.DSLR,
                        CategoryType.HIGH_END, IsoData.ISO_50, IsoData.ISO_102400, 30.1f, 61)))
    }

    companion object {
        private const val MAX_VIEWTYPES_IN_POOL = 50
        const val OPTIMIZE = true
    }
}
