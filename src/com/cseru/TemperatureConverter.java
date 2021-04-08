package com.cseru;

import java.sql.Date;

public class TemperatureConverter {
    private int averageTemp, lowTemp, highTemp;
    private double humidity, precipitation;
    private Date date;

    public TemperatureConverter() {
    }

    public TemperatureConverter(int averageTemp, int lowTemp, int highTemp) {
        this.averageTemp = averageTemp;
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
    }

    public TemperatureConverter(double humidity, double precipitation, Date date) {
        this.humidity = humidity;
        this.precipitation = precipitation;
        this.date = date;
    }

    public TemperatureConverter(int averageTemp, int lowTemp, int highTemp, double humidity, double precipitation, Date date) {
        this.averageTemp = averageTemp;
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
        this.humidity = humidity;
        this.precipitation = precipitation;
        this.date = date;
    }

    void displayWeatherInformation(){
        System.out.println("Weather Information");
        System.out.println(date);
        System.out.println(averageTemp);
        System.out.println(lowTemp);
        System.out.println(highTemp);
        System.out.println(humidity);
        System.out.println(precipitation);

    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public Date getDate() {
        return date;
    }

    public void setAverageTemp(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
