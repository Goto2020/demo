package demo.test;

import org.testng.annotations.Test;

public class demo1{
    @Test(groups = { "functest2", "checkintest.one" })
    public void testMethod1() {
    }

    @Test(groups = {"functest2", "checkintest.one1"} )
    public void testMethod2() {
    }

    @Test(groups = { "functest" })
    public void testMethod3() {
    }

} 