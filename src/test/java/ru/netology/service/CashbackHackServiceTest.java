
package ru.netology.service;

import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @Test

    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainPlusCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.testng.Assert.assertEquals(actual, expected);
    }


}
