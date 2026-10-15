interface College {
    void learnDSA();
    void learnWebDevelopment();
    void share();
}
abstract class Student implements College{
    public void learnDSA(){
        System.out.println("you must have a good skills on DSA to crack good MNCs");
    }
    public void learnWebDevelopment(){
        System.out.println("coding provides excellent to master Web Development");
    }
}

class Friends extends Student{
    public void share(){
        System.out.println("Helping to learn will make you learn too..!");
    }
}
public class InterfaceAbstractDemo{
    public static void main(String[] args){
        Friends student1 = new Friends();
        student1.learnDSA();
        student1.learnWebDevelopment();
        student1.share();
    }
}

