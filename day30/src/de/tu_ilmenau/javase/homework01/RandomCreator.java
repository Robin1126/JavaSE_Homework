package de.tu_ilmenau.javase.homework01;

import java.util.Random;

public class RandomCreator {
    private int range;

    public RandomCreator() {
    }

    public RandomCreator(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "RandomCreator{" +
                "range=" + range +
                '}';
    }
    public int create() {
        return (new Random()).nextInt(this.range) + 1;
    }
}
