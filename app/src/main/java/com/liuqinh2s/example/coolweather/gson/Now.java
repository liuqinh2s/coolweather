package com.liuqinh2s.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuqinh2s on 2018/3/5.
 */

public class Now {
    @SerializedName("temp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
