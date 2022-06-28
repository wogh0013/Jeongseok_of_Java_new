package Chapter11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector{
    public Object push(Object item){
        addElement(item);
        return item;
    }
    public Object pop(){
        Object obj = peek(); //Stack에 저장된 마지막 요소를 읽어옴
        // 만일 Stack이 비어있으면 peek() 메서드가 EmptyStackException을 발생시킴
        // 마지막 요소를 삭제함. 배열의 index가 0부터 시작하므로 1을 빼줌
        removeElementAt(size() - 1);
        return obj;
    }
    public Object peek(){
        int len = size();
        if(len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1); //index는 0부터 시작하므로 마지막은 1을 빼줘야 함
    }
    public boolean empty(){
        return size() == 0;
    }
    public int search(Object o){
        int i = lastIndexOf(o); //끝에서부터 객체를 찾음 //반환값은 저장된 위치(배열의 index)임
        if(i >= 0) //객체를 찾은 경우
            return size() - i; //Stack은 맨 위에 저장된 객체의 index를 1로 정의
        return -1; //해당 객체를 찾지 못하면 -1 반환
    }
}
