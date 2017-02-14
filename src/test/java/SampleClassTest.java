import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by kutilj on 2/14/2017.
 *
 * @author kutilj
 */
public class SampleClassTest {

    @Test
    public void testSampleMethod() throws Exception {

        String one = "This is ";
        String two = "a test.";

        SampleClass sc = new SampleClass();
        assertTrue(sc.sampleMethod(one, two).equals(one + two));
    }

}