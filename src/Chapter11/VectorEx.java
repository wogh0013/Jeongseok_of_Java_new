package Chapter11;

import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        Vector v = new Vector(5); //용량이 5인 Vector 생성
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); //빈 공간을 없앰(용량과 크기가 같아짐)
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6); //capacity가 6이상이 되도록 함
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7); //size가 7이 되게 함
        System.out.println("=== After setSize(7)");
        print(v);

        v.clear(); //Vector에 저장된 모든 요소 제거
        System.out.println("=== After clear ===");
        print(v);
    }
    public static void print(Vector v){
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
