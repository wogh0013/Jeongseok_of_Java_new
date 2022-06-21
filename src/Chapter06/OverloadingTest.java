package Chapter06;

public class OverloadingTest {
    public static void main(String[] args) {
        Test test = new Test();

        test.display(10);
        test.display(10, 20);
        test.display(10, 1.5);
    }
}

class Test{
    void display(int num1){
        System.out.println(num1);
    }
    void display(int num1, int num2){
        System.out.println(num1 * num2);
    }
    void display(int num1, double num2){
        System.out.println(num1 + num2);
    }
}
