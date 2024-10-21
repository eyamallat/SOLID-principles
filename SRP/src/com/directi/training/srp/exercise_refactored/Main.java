package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class Main {
    public  static void main(String[] args){
        CarDatabase carDatabase =new CarDatabase();
        CarLister carLister= new CarLister();
        BestCarSelector bestCarSelector=new BestCarSelector();

        List<Car>  cars =carDatabase.getAllCars();

        String carNames= carLister.getCarsNames(cars);
        System.out.println("All Cars:"+carNames);

        Car bestCar=bestCarSelector.getBestCar(cars);
        System.out.println("Best Car:"+bestCar);

        Car car=carDatabase.getCarById("2");
        System.out.println("Car with ID"+"2"+car);


        

    }
    
}
