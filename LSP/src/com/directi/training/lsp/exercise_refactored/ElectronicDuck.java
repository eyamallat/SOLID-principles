package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IQuack,ISwim {
    private boolean _on = false;

    @Override
    public void swim(){
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }
    public void quack(){
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }

    
}
