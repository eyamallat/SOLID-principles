package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
        electricDuck.turnOn();
    }

    private void quack(IQuack... IQuacks)
    {
        for (IQuack duck : IQuacks) {
            duck.quack();
        }
    }

    private void swim(ISwim... ISwims)
    {
        for (ISwim duck : ISwims) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
    
}
