import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

public class ControllerClassTest {
    private Controller controller;

    @BeforeClass
    public void createInstance() {
        Controller controller = new Controller(new View, new Model);
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
        int value=new Random().nextInt(100+1)
        Assert.assertNotEquals(value,cont);
    }

}
