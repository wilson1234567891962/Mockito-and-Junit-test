package com.prueba.test.utilidad;

import org.junit.Assert;
import org.junit.Test;

public class UtilitiesTest {

    @Test(expected = ArithmeticException.class)
    public void checkMessage(){
        Assert.assertEquals(2,3/0);
    }
}
