package Chapter06.Ex1;

public class ConstructorTest {
    public static void main(String[] args) {
        Car c1 = new Car(); //기본 생성자 호출
        Car c2 = new Car("아반떼", 120); //매개변수가 있는 생성자 호출

        System.out.println(c1.getModel());
        System.out.println(c2.getModel());
    }
}

class Car{
    private String modelName;
    private int maxSpeed;

    Car() { } //기본 생성자

    Car(String modelName, int maxSpeed){ //매개변수가 있는 생성자
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public String getModel(){
        return String.format("%s의 이름을 가진 차의 최고 속도는 %dkm입니다.", this.modelName, this.maxSpeed);
    }
}
