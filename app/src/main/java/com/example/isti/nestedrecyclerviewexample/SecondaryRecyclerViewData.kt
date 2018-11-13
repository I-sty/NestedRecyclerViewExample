package com.example.isti.nestedrecyclerviewexample

import com.example.isti.nestedrecyclerviewexample.data.CameraType
import com.example.isti.nestedrecyclerviewexample.data.CategoryType
import com.example.isti.nestedrecyclerviewexample.data.IsoData
import com.example.isti.nestedrecyclerviewexample.data.SensorType

data class SecondaryRecyclerViewData(val sensorType: SensorType, val cameraType: CameraType, val
category: CategoryType, val minIso: IsoData, val maxIso: IsoData, val trueResolution: Float, val
                                     focusPoints: Int)
