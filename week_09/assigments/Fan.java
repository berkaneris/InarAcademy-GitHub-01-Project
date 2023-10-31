package week_09.assigments;


public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    String color = "blue";


    public Fan(){
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){

        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if(on){
          return "Fan Speed: " + getSpeed() + ", color: " + getColor() + " , radius: " + getRadius();
        }else{
            return  "Fan color: " + getColor() + ", radius: " + getRadius() + "\nFan is off";
        }

    }
}
