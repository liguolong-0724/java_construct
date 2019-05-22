package com.onion.strategy;

public class MultiplyOperation implements Strategy {
    @Override
    public int doOperation(int n1, int n2) {
        return n1 * n2;
    }
}
