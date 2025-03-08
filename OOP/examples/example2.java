package OOP.examples;

public class example2 {
        public static void main(String[]agrs){
            Human H= new Human();
        H.eat();
        H.bite();

        }
        

    }
    


class Monkey{
    void jump(){
        System.out.print("Jump");
    }

    void bite(){
        System.out.print("BITE");

    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }


}
