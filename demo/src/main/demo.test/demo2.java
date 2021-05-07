import org.testng.annotations.Test;

public class demo2{
    @Test(groups = { "functest", "checkintest.one" })
    public void testMethod4() {
    }

    @Test(groups = {"functest", "checkintest.one1"} )
    public void testMethod5() {
    }

    @Test(groups = { "functest2" })
    public void testMethod6() {
    }

} 