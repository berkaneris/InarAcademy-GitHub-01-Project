package week_09.assigments;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();


        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        fan2.setSpeed(fan2.FAST);
        fan2.setRadius(5);
        fan2.turnOff();

        System.out.println(fan1);
        System.out.println("---------------------");
        System.out.println(fan2);
    }
   
}
