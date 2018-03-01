import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/03/2018.
 */
public class TestManager {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "12345STG", 5.50, "finance");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(15);
        assertEquals(20.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.055, manager.payBonus(), 0.01);
    }
}
