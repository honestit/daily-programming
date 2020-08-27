package pl.levelupyourjava.codingbat;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class WarmUp1Test {

    private WarmUp1 warmUp1;

    @Before
    public void setUp() throws Exception {
        warmUp1 = new WarmUp1();
    }

    @Test
    public void sleepIn() {
        boolean result = warmUp1.sleepIn(false, false);
        assertThat(result, is(true));
        result = warmUp1.sleepIn(true, false);
        assertThat(result, is(false));
        result = warmUp1.sleepIn(false, true);
        assertThat(result, is(true));
    }

    @Test
    public void diff21() {
        int result = warmUp1.diff21(19);
        assertThat(result, is(2));
        result = warmUp1.diff21(10);
        assertThat(result, is(11));
        result = warmUp1.diff21(21);
        assertThat(result, is(0));
        result = warmUp1.diff21(22);
        assertThat(result, is(2));
        result = warmUp1.diff21(-10);
        assertThat(result,is(31));
    }

    @Test
    public void nearHundred() {
    }

    @Test
    public void missingChar() {
    }

    @Test
    public void backAround() {
    }

    @Test
    public void startHi() {
    }

    @Test
    public void hasTeen() {
    }

    @Test
    public void mixStart() {
    }

    @Test
    public void close10() {
    }

    @Test
    public void stringE() {
    }

    @Test
    public void everyNth() {
    }

    @Test
    public void monkeyTrouble() {
    }

    @Test
    public void parrotTrouble() {
    }

    @Test
    public void posNeg() {
    }

    @Test
    public void frontBack() {
    }

    @Test
    public void or35() {
    }

    @Test
    public void icyHot() {
    }

    @Test
    public void loneTeen() {
    }

    @Test
    public void startOz() {
    }

    @Test
    public void in3050() {
    }

    @Test
    public void lastDigit() {
    }

    @Test
    public void sumDouble() {
    }

    @Test
    public void makes10() {
    }

    @Test
    public void notString() {
    }

    @Test
    public void front3() {
    }

    @Test
    public void front22() {
    }

    @Test
    public void in1020() {
    }

    @Test
    public void delDel() {
    }

    @Test
    public void intMax() {
    }

    @Test
    public void max1020() {
    }

    @Test
    public void endUp() {
    }
}