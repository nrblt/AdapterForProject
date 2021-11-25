package com.company;

public class English implements Phrases {

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void winner() {
        System.out.println("You are winner");
    }

    @Override
    public void looser() {
        System.out.println("You are looser");
    }

    @Override
    public void motivator() {
        System.out.println("I know you can win!!!");
    }
}
