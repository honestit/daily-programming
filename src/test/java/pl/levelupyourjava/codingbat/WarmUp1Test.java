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
        boolean result = warmUp1.nearHundred(93);
        assertThat(result, is(true));
        result = warmUp1.nearHundred(90);
        assertThat(result,is(true));
        result = warmUp1.nearHundred(89);
        assertThat(result,is(false));
        result = warmUp1.nearHundred(190);
        assertThat(result,is(true));
        result = warmUp1.nearHundred(210);
        assertThat(result,is(false));


    }

    @Test
    public void missingChar() {
        String result = warmUp1.missingChar("kitten", 1);
        assertThat(result, is("ktten"));
        result = warmUp1.missingChar("kitten", 0);
        assertThat(result, is("itten"));
        result = warmUp1.missingChar("kitten", 4);
        assertThat(result, is("kittn"));
    }

    @Test
    public void backAround() {
        String result = warmUp1.backAround("cat");
        assertThat(result, is("tcatt"));
        result = warmUp1.backAround("Hello");
        assertThat(result, is("oHelloo"));
        result = warmUp1.backAround("a");
        assertThat(result, is("aaa"));
    }

    @Test
    public void startHi() {
    boolean result = warmUp1.startHi("hi there");
    assertThat(result, is(true));
    result = warmUp1.startHi("hi");
    assertThat(result, is(true));
    result = warmUp1.startHi("hello hi");
    assertThat(result, is(false));
    }

    @Test
    public void hasTeen() {
        boolean result = warmUp1.hasTeen(13, 20, 10);
        assertThat(result, is(true));
        result = warmUp1.hasTeen(20, 19, 10);
        assertThat(result, is(true));
        result = warmUp1.hasTeen(20, 10, 13);
        assertThat(result, is(true));
        result = warmUp1.hasTeen(20, 20, 20);
        assertThat(result, is(false));
        result = warmUp1.hasTeen(12, 12, 12);
        assertThat(result, is(false));
    }

    @Test
    public void mixStart() {
        boolean result = warmUp1.mixStart("mix snacks");
        assertThat(result, is(true));
        result = warmUp1.mixStart("pix snacks");
        assertThat(result, is(true));
        result = warmUp1.mixStart("piz snacks");
        assertThat(result, is(false));
        result = warmUp1.mixStart("mmix snacks");
        assertThat(result, is(false));
        result = warmUp1.mixStart("9ix snacks");
        assertThat(result, is(true));
        result = warmUp1.mixStart("9mix snacks");
        assertThat(result, is(false));
    }

    @Test
    public void close10() {
        int result = warmUp1.close10(8, 13);
        assertThat(result, is(8));
        result = warmUp1.close10(13, 8);
        assertThat(result, is(8));
        result = warmUp1.close10(13, 7);
        assertThat(result, is(0));
        result = warmUp1.close10(13, 13);
        assertThat(result, is(0));
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