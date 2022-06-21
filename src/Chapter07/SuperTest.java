package Chapter07;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent2{
    int x=10;
}

class Child2 extends Parent2{
    int x=20;

    void method(){
        System.out.println("x= " + x);       //20
        System.out.println("x= " + this.x);  //20
        System.out.println("x= " + super.x); //10
    }
}