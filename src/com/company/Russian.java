package com.company;

public class Russian implements Phrases{
    private Phrases english=new English();

    @Override
    public void hello() {
        System.out.println("Привет");
        english.hello();
    }

    @Override
    public void winner() {
        english.winner();
        System.out.println("Ты победил");
    }

    @Override
    public void looser() {
        english.looser();
        System.out.println("Ты лузер");
    }

    @Override
    public void motivator() {
        english.motivator();
        System.out.println("Я знаю ты можешь выиграть");
    }
}
