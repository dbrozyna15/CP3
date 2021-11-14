/*
4. Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit. 
You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect. Then create a program that calculates and displays the temperature:

a. 25 degrees Celsius in Kelvin and Fahrenheit
b. 100 degrees Fahrenheit in Kelvin and Celsius
c. 0 degrees Kelvin in Celsius and Fahrenheit
*/

public class ConvertTemperature
{
    public static float celsiusToKelvin(float temp) {
        return temp + 273.15f;
    }
    
    public static float kelvinToCelsius(float temp) {
        return temp - 273.15f;
    }
    
    public static float celsiusToFahrenheit(float temp) {
        return (temp * 9/5) + 32;
    }
    
    public static float fahrenheitToCelsius(float temp) {
        return (temp - 32) * 5/9;
    }
    
    public static float kelvinToFahrenheit(float temp) {
        return (temp - 273.15f) * 9/5 + 32;
    }
    
    public static float fahrenheitToKelvin(float temp) {
        return (temp - 32) * 5/9 + 273.15f;
    }
}
