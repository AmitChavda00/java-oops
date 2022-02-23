class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("My name is : "+name);
    }
}

public class MainClass{
    public static void main(String args[]){
        Dog husky = new Dog();
        husky.name="Miky";
        husky.eat();
        husky.display();
    }
}