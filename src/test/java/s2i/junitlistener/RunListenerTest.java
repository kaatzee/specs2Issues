package s2i.junitlistener;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(MyRunner.class)
public class RunListenerTest {

    @BeforeClass
    public static void setUp() throws Exception {
        throw new RuntimeException("Exception in beforeAll.");
    }

    @Test
    public void testListener(){

    }

    @Test
    public void testFalseAssertion(){
        assertTrue(false);
    }

    @Ignore
    @Test
    public void testIgnore(){

    }

    @Test
    public void testException(){
        throw new RuntimeException();
    }

}
