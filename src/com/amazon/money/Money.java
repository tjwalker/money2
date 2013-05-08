package com.amazon.money;

public class Money {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Money add(int amount) {
        return new Money(this.amount + amount);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Money))
            return false;
        Money moneyObject = (Money) o;
        return this.amount == moneyObject.getAmount();
    }
    
    @Override
    public int hashCode() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "Amount: " + this.amount;
    }

}
