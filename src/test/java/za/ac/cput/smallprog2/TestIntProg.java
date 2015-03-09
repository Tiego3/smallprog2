package za.ac.cput.smallprog2;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TestIntProg extends TestCase {
        @Test
        public void testFloat() throws Exception{
            IntProg fp = new IntProg();
            assertEquals(9,fp.mainIntProg());
        }
}
