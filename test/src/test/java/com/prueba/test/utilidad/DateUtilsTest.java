package com.prueba.test.utilidad;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateUtilsTest {

    private DateUtils dateUtils;

    @Before
    public void setUp() {
        dateUtils = new DateUtils();
    }


    @Test
    public void ifYearIsDivisibleBy400_IsLeap() {
        assertThat(dateUtils.isLeapYear(2000), is(true));
    }

    @Test
    public void ifYearIsDivisibleBy4ButItIsNotDivisibleBy400_IsNotLeap() {
        assertThat(dateUtils.isLeapYear(2019), is(false));
    }

    @Test
    public void ifYearIsDivisibleBy4ButItIsNotDivisibleBy100_IsLeap() {
        assertThat(dateUtils.isLeapYear(1996), is(true));
    }

    @Test
    public void ifYearIsNotDivisibleBy4_IsNotLeap() {
        assertThat(dateUtils.isLeapYear(2017), is(false));
    }
}