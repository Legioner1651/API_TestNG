package example1;

import org.testng.annotations.*;

public class Simple1Test {

    @BeforeClass
    public void setUp() {
        System.out.println("!!!metod setUp!!!");
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }

}
