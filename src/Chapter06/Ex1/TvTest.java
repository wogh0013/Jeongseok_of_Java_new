package Chapter06.Ex1;

public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 채널값은 " + t1.channel);
        System.out.println("t2의 채널값은 " + t2.channel);

        t2 = t1; //t1이 저장하고 있는 값(주소)을 t2에 저장
        t1.channel = 10;
        System.out.println("t1의 채널값은 " + t1.channel);
        System.out.println("t2의 채널값은 " + t2.channel);
    }
}

class Tv{
    String color;
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}
