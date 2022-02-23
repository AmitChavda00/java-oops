class Maths{
    
    static public int multiply(int x,int y){
        return x*y;
    }

    static public float multiply(int x,float y){
        return x*y;
    }

    static public float multiply(float x,int y){
        return x*y;
    }
    static public float multiply(float x,float y){
        return x*y;
    }
}
public class MethodOverloading{
    public static void main(String args[]){
        System.out.println(Maths.multiply(2.5f, 5));
        System.out.println(Maths.multiply(2, 5));
        System.out.println(Maths.multiply(2.5f, 5.2f));
    }
}