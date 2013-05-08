package com.amazon.money;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {
    @Test
    public void testMoneyEquals() {
        Money expectedMoney = new Money(10);
        assertEquals(expectedMoney, new Money(10));
    }
    
    @Test
    public void testAdd() {
        Money expectedMoney = new Money(20);
        Money money = new Money(8);
        assertEquals(expectedMoney, money.add(12));
    }
}
