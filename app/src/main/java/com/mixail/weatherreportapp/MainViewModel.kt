package com.mixail.weatherreportapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mixail.weatherreportapp.model.WeatherModel

class MainViewModel:ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}