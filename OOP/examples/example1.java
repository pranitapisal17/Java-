package OOP.examples;

public class example1 {
    public static void main(String[]args){
        Fountainpen pen1 =new Fountainpen();
        pen1.changeNib();
        pen1.write();
        pen1.refill();

    }
    
}

abstract class Pen{
    abstract void write();
    abstract void refill();

}

class Fountainpen extends Pen{
    public void write(){
        System.out.println("It writes good...");
    }

    public void refill(){
        System.out.println("Refill the pen after your use!");
    }

    public void changeNib(){
        System.out.println("Changing the nnib....");

    }
}

