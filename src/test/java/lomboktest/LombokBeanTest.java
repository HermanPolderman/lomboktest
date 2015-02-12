package lomboktest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LombokBeanTest {

    @Test
    public void happyCase() throws Exception {
    	
		LombokBean test = new LombokBean();
		test.init();
        assertEquals("name", test.getName());
    }
}
