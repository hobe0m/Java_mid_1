package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        // 책을 4권 넣을 수 있는 도서관 생성
        Library library = new Library(4);
        
        // 책 추가
        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        
        // 4권까지만 넣을 수 있어 이 책은 들어가지 않는다.
        library.addBook("OneMoreThing", "잡스");
        
        // 도서관에 있는 모든 책 정보 열람
        library.showBooks(); 
    }
}
