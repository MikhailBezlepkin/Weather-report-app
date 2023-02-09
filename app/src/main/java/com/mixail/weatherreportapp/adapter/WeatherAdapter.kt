package com.mixail.weatherreportapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mixail.weatherreportapp.R
import com.mixail.weatherreportapp.model.WeatherModel
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.android.synthetic.main.item_layout.view.*

class WeatherAdapter: RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {

    var listWeather = emptyList<WeatherModel>()

    class WeatherViewHolder(view: View) : RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_main, parent, false)
        return WeatherViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        with(holder.itemView) {
            tvCity.text = listWeather[position].location.name
            tvData.text = listWeather[position].current.last_updated
            tvCondition.text = listWeather[position].current.condition.text
            tvTemp.text = listWeather[position].current.temp_c.toString()
            imWeather.load(listWeather[position].current.condition.icon)
    /*
             val item = WeatherModel(
            mainObject.getJSONObject("location").getString("name"),
            mainObject.getJSONObject("current").getString("last_updated"),
            mainObject.getJSONObject("current")
                .getJSONObject("condition").getString("text"),
            mainObject.getJSONObject("current")
                .getJSONObject("condition").getString("icon"),
            mainObject.getJSONObject("current").getString("temp_c"),
            weatherItem.maxTemp,
            weatherItem.minTemp,
            weatherItem.hours
        )
        viewModel.liveDataCurrent.value = item
            */
        }


    }

    override fun getItemCount(): Int {
        return listWeather.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<WeatherModel>) {
        listWeather = list
        notifyDataSetChanged()
    }
}