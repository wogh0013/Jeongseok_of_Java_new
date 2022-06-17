package Chapter06.Ex1;

public class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.add(100L, 200L)); //클래스 메서드 호출

        MyMath mm = new MyMath(); //인스턴스 생성
        mm.a = 25;
        mm.b = 50;
        System.out.println(mm.add()); //인스턴스 메서드 호출
    }
}

class MyMath{
    long a, b;

    long add(){         //인스턴스 메서드
        return a + b;
    }

    static long add(long a, long b){    //클래스 메서드
        return a + b;
    }
}