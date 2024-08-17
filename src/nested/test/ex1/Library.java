package nested.test.ex1;

// 도서 관리 시스템
// 도서관에서 사용할 수 있는 간단한 도서 관리 시스템을 만들어 보자.
// 이 시스템은 여러 권의 도서 정보를 관리할 수 있어야 한다.
// 각 도서는 도서 제목( title )과 저자명( author )을 가지고 있다.
// 시스템은 도서를 추가하고, 모든 도서의 정보를 출력하는 기능을 제공해야 한다.

// Library 클래스를 완성해라.
// LibraryMain과 실행 결과를 참고하자.
// Book 클래스는 Library 내부에서만 사용되며 Library 클래스 외부로 노출하면 안된다.
// Library 클래스는 Book 객체 배열을 사용해서 도서 목록을 관리한다.
public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    // 책을 추가할 때는 제목과 저자를 알아야 한다.
    public void addBook(String title, String author) {
        // 현재 보유 중인 책이 도서관에서 수용할 수 있는 책의 갯수보다 적다면 도서관의 빈 칸에 새로운 책을 넣는다.
        if (bookCount < books.length) {
            // 인덱스(현재 책의 수보다 -1)이기 때문에 책을 먼저 넣고 번호를 하나 증가시킨다.
            books[bookCount++] = new Book(title, author);
            System.out.println("책이 저장되었습니다.");
        } else {
            // 만약 저장 공간이 부족하면 부족하다는 메세지를 출력
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목 : " + books[i].title + " 저자 : " + books[i].author);
        }
    }

    // Book 클래스를 내부 정적 중첩 클래스로 생성
    // 일부가 아닌 전혀 다른 클래스이지만 Library에서만 사용되므로 정적 중첩 클래스 사용
    private static class Book {
        private String title;
        private String author;

        // 책을 생성할 때 매개 변수로 제목과 저자를 받아야 생성할 수 있게 한다.
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
