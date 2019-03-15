package cput.ac.za;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testHourly()
    {
        Employee emp1 = new Employee("Name Surname",25.00,5.00);
        Assert.assertEquals("Test Name","Name Surname", emp1.getName());
        Assert.assertEquals("Test Rate",25.00,emp1.getRate(),0);
        Assert.assertEquals("Test Hours",5.00,emp1.getHours(),0);
        Assert.assertEquals("Test Total", 125.00,emp1.pay(),0);
        Assert.assertThat(emp1,instanceOf(Employee.class));
    }

    @Test
    public void TestSalaried(){
        Employee emp1 = new Employee("Name Surname",225.00);
        Assert.assertEquals("Test Name","Name Surname", emp1.getName());
        Assert.assertEquals("Test Salary",225.00,emp1.getSalary(),0);
        Assert.assertThat(emp1,instanceOf(Employee.class));
    }
}
