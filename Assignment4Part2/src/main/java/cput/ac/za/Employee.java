package cput.ac.za;

public class Employee  {
    private String name;
    private Hourly hourly;
    private Salaried salaried;
    
    /*
    private double rate;
    private double salary;
    private double hours;
    */

    public Employee(String name,double rate, double hours)  {
        this.hourly = new Hourly();
        setName(name);
        hourly.setRate(rate);
        hourly.setHours(hours);
    }

    public Employee(String name, double salary){
        this.salaried = new Salaried();
        setName(name);
        salaried.setSalary(salary);
    }

    public String getName()  {
        return name;
    }

    public void setName(String nm)  {
        name = nm;
    }

    public double getRate()  {
        return hourly.getRate();
    }
    public double getHours()  {
        return hourly.getHours();
    }

    public double getSalary()  {
        return salaried.getSalary();
    }

    public double pay()  {
        return hourly.pay();
    }

}
