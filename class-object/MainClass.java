public class MainClass{

    public void showMessage(String msg){
        System.out.println("Your message : "+msg);
    }
    public static void main(String args[]){
        System.out.println("Hello world !");

        MainClass object = new MainClass();
        object.showMessage("This is example of class and object");
    }
}