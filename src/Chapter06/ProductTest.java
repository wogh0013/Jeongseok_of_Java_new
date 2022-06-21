package Chapter06;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호 (serial no)는 " + p1.serialNo); //1
        System.out.println("p2의 제품번호 (serial no)는 " + p2.serialNo); //2
        System.out.println("p3의 제품번호 (serial no)는 " + p3.serialNo); //3
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개입니다."); //3
    }
}

class Product {
    static int count = 0;  //생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;          //인스턴스 고유의 번호

    {   //인스턴스 초기화 블럭 - 모든 생성자에서 공통적으로 수행될 코드
        ++count;
        serialNo = count;    //Product 인스턴스가 생성될 때마다, count의 값을 1씩 증가시켜 serialNo에 저장한다.
    }

    public Product(){} //기본 생성자
}
