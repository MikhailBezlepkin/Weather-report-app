package com.mixail.weatherreportapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.location.FusedLocationProviderClient
import com.mixail.weatherreportapp.MainViewModel
import com.mixail.weatherreportapp.R
import com.mixail.weatherreportapp.WeatherViewModel
import com.mixail.weatherreportapp.adapter.WeatherAdapter
import com.mixail.weatherreportapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var fLocationClient: FusedLocationProviderClient
    private lateinit var binding: FragmentMainBinding
    private lateinit var pLauncher: ActivityResultLauncher<String>
    lateinit var adapter: WeatherAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        visibilityItem()
       /* checkPermission()
        init()
        requestWeatherData("Omsk")
        updateCurrentCard()

        ibSearch.setOnClickListener {
            searchCity()
        }

        ibSearchCity.setOnClickListener{
            if(edSearchCity.text!= null){
                init()
                requestWeatherData(edSearchCity.text.toString())
                updateCurrentCard()
                visibilityItem()
            }

        }*/
        val viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)
        val it = ViewModelProvider(this).get(WeatherViewModel::class.java)
       /* adapter = WeatherAdapter()
        viewModel.getWeatherVM("Novosibirsk")
        viewModel.myWeatherList.observe(viewLifecycleOwner
        ) { list ->
            adapter.setList(list)
        }
        ibClose.setOnClickListener {
            visibilityItem()
        }*/
    }

    private fun visibilityItem() = with(binding) {
        ibSearch.visibility = View.VISIBLE
        tvCity.visibility = View.VISIBLE
        ibClose.visibility = View.GONE
        ibSearchCity.visibility = View.GONE
        edSearchCity.visibility = View.GONE
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}