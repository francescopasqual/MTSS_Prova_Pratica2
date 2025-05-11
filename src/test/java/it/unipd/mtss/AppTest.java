////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class AppTest {
    App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void simpleUsage() {
        App.main(new String[] { "1", "5" });
        App.checkResult("1");
    }

    @Test
    public void conformanceTest() {
        App.main(new String[] { "A", "B" });
        App.checkResult("A");
    }

    @Test
    public void existenceTest() {
        App.main(new String[] {});
        App.main(null);
        App.checkResult(null);
        App.checkResult("");
        App.checkResult("-1");
    }
}