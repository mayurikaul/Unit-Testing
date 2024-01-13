package example.stack;

import org.junit.Assert;

import java.beans.Transient;

public class SimpleStackTest {

    @Test
    public void testNewStackIsEmpty() {
        SimpleStack stack  = new SimpleStack();
        Assert.assertTrue("New stack should be empty!", true == stack.isEmpty());

    }

    @Test
    public void testNewStackPush() {
        SimpleStack stack  = new SimpleStack();
        int item = 1;
        stack.push(item);
        Assert.assertFalse("Stack should not be empty after item has been pushed!", stack.isEmpty());
    }

    
}