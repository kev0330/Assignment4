package cput.ac.za;

public abstract class Employee  {
    private String name;

    public Employee(String name)  {
        setName(name);
    }
    public String getName()  {
        return name;
    }

    private void setName(String nm)  {
        name = nm;
    }

    public abstract double pay();

}
