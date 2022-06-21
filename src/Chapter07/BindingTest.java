package Chapter07;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println("p.x = " + p.x); //멤버변수의 경우 참조변수 타입으로 !!
        p.method();                         //메서드의 경우 실제 인스턴스 타입으로 !!
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent{
    int x = 100;
    void method(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    int x = 200;
    void method(){
        System.out.println("Child Method");
    }
}