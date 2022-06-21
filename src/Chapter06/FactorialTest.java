package Chapter06;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n){
        int result = 0;

        if(n == 1){
            result = 1;
        }
        else
            result = n * factorial(n-1); //메서드 내에서 자기 자신을 호출
        return result;
    }
}
