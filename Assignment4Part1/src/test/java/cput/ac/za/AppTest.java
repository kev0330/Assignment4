package cput.ac.za;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testHourly()
    {
        Employee emp1 = new Hourly("Name Surname", 45.00, 4);
        Assert.assertEquals("Test Name","Name Surname",emp1.getName());
        Assert.assertEquals("Test Rate", 45,((Hourly) emp1).getRate(),0);
        Assert.assertEquals("Test Hours",4,((Hourly) emp1).getHours(),0);
        Assert.assertEquals("Test Total", 180,emp1.pay(),0);
        Assert.assertThat(emp1,instanceOf(Hourly.class));
    }

    @Test
    public void testSalaried(){
        Employee emp2 = new Salaried("Name Surname", 200.00);
        Assert.assertEquals("Test Name","Name Surname",emp2.getName());
        Assert.assertEquals("Test Salary", 200,((Salaried) emp2).salary,0);
        Assert.assertThat(emp2,instanceOf(Salaried.class));
    }

}
