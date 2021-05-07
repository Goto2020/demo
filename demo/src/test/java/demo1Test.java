import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class demo1Test {
    @Test
    public void testcase1(){
        Assert.assertFalse(false);
        System.out.println("“testcase1”");
    }
    @Test
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("“testcase2”");
    }
}