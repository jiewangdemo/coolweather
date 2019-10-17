package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 2019/10/17.
 */

public class AQI {
	@SerializedName("city")
	public AQICity city;

	public class AQICity{

		public String aqi;
		public String pm25;
	}
}
