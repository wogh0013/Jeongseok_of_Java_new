package Chapter08;

public class ExceptionEx {
    public static void main(String[] args) {
        try{
            throw new Exception("고의로 발생시킴");
        } catch(Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료됨");
    }
}