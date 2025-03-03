class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{Math.round(kelvin * 100000.0) / 100000.0, Math.round(fahrenheit * 100000.0) / 100000.0};
        
    }
}