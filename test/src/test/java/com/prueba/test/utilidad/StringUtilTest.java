package com.prueba.test.utilidad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

    private StringUtil stringUtil;

    @Before
    public void setUp() {
        stringUtil = new StringUtil();
    }

    @Test
    public void ckeckIsEmpty() {
        Assert.assertEquals(stringUtil.isEmpty(""), true);
    }

    @Test
    public void ckeckIsNotEmpty() {
        Assert.assertEquals(stringUtil.isEmpty("A"), false);
    }

    @Test
    public void ckeckIsNullIsEmpty() {
        Assert.assertEquals(stringUtil.isEmpty(null), false);
    }

    @Test
    public void ckeckIsSpaceIsEmpty() {
        Assert.assertEquals(stringUtil.isEmpty("   ".trim()), true);
    }
}
