import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Emma", "67895BHT", 300);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(50);
        assertEquals(350, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(3.0, databaseAdmin.payBonus(), 0.01);
    }


}
