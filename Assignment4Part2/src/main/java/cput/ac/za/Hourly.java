package cput.ac.za;

public class Hourly{

    private double rate;
    private double hours;


    public void setRate(double r)  {
        rate = r;
    }
    public void setHours(double hr)  {
        hours = hr;
    }

    public double getRate()  {
        return rate;
    }
    public double getHours()  {
        return hours;
    }

    public double pay()  {
        return rate * hours;
    }

}
