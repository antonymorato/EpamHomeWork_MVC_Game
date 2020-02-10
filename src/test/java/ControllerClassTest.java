import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.kpi.iasa.Controller;
import ua.kpi.iasa.Model;
import ua.kpi.iasa.View;

import java.util.Random;

public class ControllerClassTest {
    private Controller controller;

    @BeforeClass
    public void createInstance() {
        Controller controller = new Controller( new Model(),new View());
    }
    @Test
    public void testInputReturnsTrue()
    {
        int value=new Random().nextInt(100+1);

        Assert.assertEquals(value,controller.input());
    }
    @Test
    public void testInputReturnsFalse()
    {
        int value=new Random().nextInt(100+1);
        Assert.assertNotEquals(value,controller.input());
    }

}
