package Quiz;

import java.util.ArrayList;

//Quiz02
// 리스트에 'A'라는 문자가 있는지 확인하고
// 있다면 리스트에ㅓ 삭제하세요

//Quiz03
// 책번호와 제목을 멤버로 가지는 Book 클래스를 만드세여
// Book 타입의 리스트를생성하세요 
// 리스트에 책 3권을 추가하세요

// 리스트에 저장된 모든 책의 정보를 출력하세요
// 리스트의 모든 요소를 삭제하세요

class Book {
    private int bookNumber;
    private String title;

    public Book(int bookNumber, String title) {
        this.bookNumber = bookNumber;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [bookNumber=" + bookNumber + ", title=" + title + "]";
    }
}

public class Quiz0203 {
    public static void main(String[] args) {
        // Quiz02
        // 리스트에 'A'라는 문자가 있는지 확인하고 있다면 리스트에서 삭제하세요
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');

        // 리스트에 'A'라는 문자가 있는지 확인하고 있다면 리스트에서 삭제
        if (charList.contains('A')) {
            charList.remove(Character.valueOf('A'));
        }

        System.out.println("Quiz02 리스트: " + charList);

        // Quiz03
        // 책번호와 제목을 멤버로 가지는 Book 클래스를 만드세요
        // Book 타입의 리스트를 생성하세요
        // 리스트에 책 3권을 추가하세요
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "가나다"));
        bookList.add(new Book(2, "라마바"));
        bookList.add(new Book(3, "사아자"));

        // 리스트에 저장된 모든 책의 정보를 출력
        System.out.println("Quiz03 책 리스트:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // 리스트의 모든 요소를 삭제
        bookList.clear();
        System.out.println("책 리스트 삭제 후: " + bookList);
    }
}