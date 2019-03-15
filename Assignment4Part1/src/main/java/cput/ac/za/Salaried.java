package cput.ac.za;

public class Salaried extends Employee  {
    double salary;

    public Salaried(String nam, double sal)  {
        super(nam);
        setSalary(sal);
    }

    public void setSalary(double s)  {
        salary = s;
    }

    public double getSalary()  {
        return salary;
    }

    public double pay()  {
        return salary;
    }

}
