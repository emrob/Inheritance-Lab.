import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director("Jane", "92347SPY", 500, "tech", 10000);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(200);
        assertEquals(700, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(5.0, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000, director.getBudget(), 0.01 );
    }
}
