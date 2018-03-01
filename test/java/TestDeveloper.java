import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mark", "19845GHG", 100.50);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(100);
        assertEquals(200.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.005, developer.payBonus(), 0.01);
    }
}
