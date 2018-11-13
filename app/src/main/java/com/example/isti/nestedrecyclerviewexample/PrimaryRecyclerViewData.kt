package com.example.isti.nestedrecyclerviewexample

import android.content.Context
import com.example.isti.nestedrecyclerviewexample.data.BrandData
import com.example.isti.nestedrecyclerviewexample.data.SecondaryRecyclerViewDataKey

data class PrimaryRecyclerViewData(val brand: BrandData, val model: String, val price: Float, val specs: SecondaryRecyclerViewData) {
    fun getSpecsAsList(context: Context): ArrayList<SecondaryRecyclerViewDataKey> {
        val list: ArrayList<SecondaryRecyclerViewDataKey> = ArrayList()
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_iso), specs.minIso.toString()
                + " " + specs.maxIso.toString()))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_sensor_type),
                specs.sensorType.name))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_camera_type),
                specs.cameraType.name))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_category_type),
                specs.category.name))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_focus_points),
                specs.focusPoints.toString()))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_true_resolution),
                specs.trueResolution.toString()))
        return list
    }
}
