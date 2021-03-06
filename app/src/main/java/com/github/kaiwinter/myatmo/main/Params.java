package com.github.kaiwinter.myatmo.main;

public class Params {

    private Params() {
        throw new IllegalStateException("Utility class");
    }

    // These are all the scales available.
    public static final String SCALE_MAX = "max";
    public static final String SCALE_THIRTY_MINUTES = "30min";
    public static final String SCALE_ONE_HOUR = "1hour";
    public static final String SCALE_THREE_HOURS = "3hours";
    public static final String SCALE_ONE_DAY = "1day";
    public static final String SCALE_ONE_WEEK = "1week";
    public static final String SCALE_ONE_MONTH = "1month";

    // These are some of the types available.
    // See the full list here: http://dev.netatmo.com/doc/restapi/getmeasure
    public static final String TYPE_TEMPERATURE = "Temperature";
    public static final String TYPE_MIN_TEMP = "min_temp";
    public static final String TYPE_MAX_TEMP = "max_temp";
    public static final String TYPE_CO2 = "CO2";
    public static final String TYPE_HUMIDITY = "Humidity";
    public static final String TYPE_PRESSURE = "Pressure";
    public static final String TYPE_NOISE = "Noise";
    public static final String TYPE_RAIN = "Rain";
    public static final String TYPE_RAIN_SUM = "sum_rain";
    public static final String TYPE_WIND_ANGLE = "WindAngle";
    public static final String TYPE_WIND_STRENGTH = "WindStrength";
    public static final String TYPE_GUST_ANGLE = "GustAngle";
    public static final String TYPE_GUST_STRENGTH = "GustStrength";
}