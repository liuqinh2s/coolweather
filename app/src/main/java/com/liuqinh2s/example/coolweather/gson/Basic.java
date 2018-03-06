package com.liuqinh2s.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuqinh2s on 2018/3/5.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
