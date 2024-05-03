package Quiz;

import java.util.ArrayList;

//1)Character타입의 ArrayList 생성
//문자 3개 추가(A,B,C)
//리스트 요소를 하나씩 출력
//리스트 두번째 삭제(B)
//리스트 크기 출력

public class Quiz01 {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();

        charList.add('A');
        charList.add('B');
        charList.add('C');

        System.out.println("리스트 요소:");
        for (Character ch : charList) {
            System.out.println(ch);
        }

        charList.remove(1);

        System.out.println("리스트 크기: " + charList.size());
    }
}