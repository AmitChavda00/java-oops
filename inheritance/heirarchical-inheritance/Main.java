class Car{
    private int wheels;
    private int speed;

    public void run(){
        System.out.println("I can run");
    }

    public void setWheels(int wheels){
        this.wheels=wheels;
    }

    public int getWheels(){
        return wheels;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

}

class RangRover extends Car{
    public void display(){
        System.out.println("I  have "+getWheels()+" wheels and I can run at "+getSpeed()+" km/h speed");
    }
}

class Lamborghini extends Car{
    public void display(){
        System.out.println("I  have "+getWheels()+" wheels and I can run at "+getSpeed()+" km/h speed");
    }
}
public class Main {
    public static void main(String args[]){
        RangRover rangRover=new RangRover();
        rangRover.setWheels(4);
        rangRover.setSpeed(135);
        rangRover.display();

        Lamborghini lamborghini=new Lamborghini();
        lamborghini.setWheels(4);
        lamborghini.setSpeed(195);
        lamborghini.display();

    }
}
