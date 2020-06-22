import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class driverTest {
    private Driver driver1;


    @Test
    public void driverShouldHaveName(){
        Driver name = new Driver("Dan");
        String result = name.getName();
        assertEquals("Dan", result);
    }

}
