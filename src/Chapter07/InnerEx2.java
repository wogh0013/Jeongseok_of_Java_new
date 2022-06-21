package Chapter07;

public class InnerEx2 {
    Object iv = new Object(){
        void method(){};
    }; //익명 클래스(선언과 생성을 동시에)

    static Object cv = new Object(){
        void method(){};
    }; //익명 클래스

    void myMethod(){
        Object iv = new Object(){
            void method(){};
        }; //익명 클래스
    }
}
