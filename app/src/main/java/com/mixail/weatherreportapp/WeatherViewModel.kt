package com.mixail.weatherreportapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mixail.weatherreportapp.data.repository.Repository
import com.mixail.weatherreportapp.model.WeatherModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WeatherViewModel:ViewModel() {
    var repo = Repository()
    var myWeatherList: MutableLiveData<List<WeatherModel>> = MutableLiveData()

    fun getWeatherVM(city:String){
        viewModelScope.launch {
            val body = withContext(Dispatchers.IO) {
                repo.getWeather(city).body()
            }
            myWeatherList.value =body?.results?: emptyList()
        }
    }
}