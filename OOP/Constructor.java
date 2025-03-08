package OOP;
public class Constructor{
    public static void main(String[]args) {
        Student s1=new Student();
        Student s2=new Student("pranita");
        Student s3=new Student("pranita",24,"comp");
    }

}



class Student{
    String name;
    int rollno;
    String dept;

    //default constructor
    Student(){
        System.out.println("Default constructor is called ");

    }
 

    //parametarized constructor
    Student(String name){
        this.name="name";
        System.out.println(this.name);
        

    }

    Student(String name,int rollno,String dept){
        this.name="name";
        this.rollno=rollno;
        this.dept=dept;
        System.out.println("Name is -"+this.name+"  rollno-"+this.rollno+"  Depart-"+this.dept );

    }
}
