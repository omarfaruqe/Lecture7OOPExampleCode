package com.cseru;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.color = 3;
        vehicle2.color = 4;


        Book book = new Book();
        book.isBookBorrowed(); // return false
        Book book1 = new Book("Java", "Deitel", true);
        book1.isBookBorrowed(); // return true


	// write your code here
//
//        int saturdayTemperature;
//        int sundayTemperature;
//        saturdayTemperature = 78;
//        sundayTemperature = 83;
//
//        double saturdayTemperatureInCelsius;
//        double sundayTemperatureInCelsius;
//
//        saturdayTemperatureInCelsius = (5.0 / 9.0) * saturdayTemperature;
//        sundayTemperatureInCelsius = (5.0 / 9.0) * sundayTemperature;
//
//        System.out.println("Weekend average temperature");
//        System.out.println(saturdayTemperatureInCelsius);
//        System.out.println(sundayTemperatureInCelsius);


        Date date = Date.valueOf("2021-04-08");
        TemperatureConverter temperatureConverter = new TemperatureConverter();
//        temperatureConverter.averageTemp = 66;
//        System.out.println(temperatureConverter.averageTemp);
        temperatureConverter.setAverageTemp(55);
        temperatureConverter.setHumidity(89.5);

        TemperatureConverter temperatureConverterWithParameter =
                new TemperatureConverter(34, 23, 45, 89.7, 67.9, date);
        //temperatureConverter.displayWeatherInformation();

        TemperatureConverter temperatureConverter2 = new TemperatureConverter(23, 12, 56);
        //temperatureConverter2.displayWeatherInformation();

        TemperatureConverter temperatureConverter3 = new TemperatureConverter(4.5,5.6,date);
        temperatureConverter3.displayWeatherInformation();
    }
}
