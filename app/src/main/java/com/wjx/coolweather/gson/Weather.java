package com.wjx.coolweather.gson;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2015/12/29.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}