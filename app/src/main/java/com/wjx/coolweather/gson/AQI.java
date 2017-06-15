package com.wjx.coolweather.gson;

/**
 * Created by Administrator on 2015/12/29.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
