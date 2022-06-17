package Chapter06.Ex1;

public class ReferenceTypeTest {
    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("change() 전: x = " + d.x);

        change(d);
        System.out.println("change() 후: x = " + d.x);
    }

    static void change(Data d){ //참조형 매개변수, 만약 기본형 매개변수면 int x
        d.x = 1000;
        System.out.println("change(): x = " + d.x);
    }
}

class Data{
    int x;
}
