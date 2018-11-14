package com.example.isti.nestedrecyclerviewexample.data

import android.content.Context
import com.example.isti.nestedrecyclerviewexample.R
import com.example.isti.nestedrecyclerviewexample.controller.SecondaryViewTypes
import java.util.*

data class PrimaryRecyclerViewData(val brand: BrandData, val model: String, val price: Float, val
announced: Date, val specs: SecondaryRecyclerViewData) {
    fun getSpecsAsList(context: Context): ArrayList<SecondaryRecyclerViewDataKey> {
        val list: ArrayList<SecondaryRecyclerViewDataKey> = ArrayList()
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_iso), specs.minIso.toString() + " " + specs.maxIso.toString()))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_sensor_type), specs.sensorType.name, SecondaryViewTypes.SENSOR))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_camera_type), specs.cameraType.name, SecondaryViewTypes.CAMERA))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_category_type), specs.category.name))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_focus_points), specs.focusPoints.toString()))
        list.add(SecondaryRecyclerViewDataKey(context.getString(R.string.label_true_resolution), specs.trueResolution.toString()))
        return list
    }
}
