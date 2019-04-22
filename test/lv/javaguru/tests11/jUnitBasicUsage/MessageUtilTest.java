package lv.javaguru.tests11.jUnitBasicUsage;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageUtilTest {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
//        message = "New Word";
        assertEquals(message,messageUtil.printMessage());
    }

}