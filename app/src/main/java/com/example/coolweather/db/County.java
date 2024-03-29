package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2019/10/17.
 */

public class County extends DataSupport {
	private int id;
	private String countyName;
	private String weatherId;
	private int cityId;

	public void setId(int id) {
		this.id = id;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public void setWeatherId(String weatherId) {
		this.weatherId = weatherId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getId() {
		return id;
	}

	public String getCountyName() {
		return countyName;
	}

	public String getWeatherId() {
		return weatherId;
	}

	public int getCityId() {
		return cityId;
	}
}
