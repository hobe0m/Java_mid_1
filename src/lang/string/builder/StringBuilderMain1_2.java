package lang.string.builder;

public class StringBuilderMain1_2 {
    // StringBuilder는 메서드 체이닝 기법을 제공한다.
    // append(), delete(), insert(), reverse()는 자기 자신을 반환한다.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String string = sb.append("A").append("B").append("C").append("D")
                            .insert(4, "Java")
                                    .delete(4, 8)
                                            .reverse()
                                                    .toString();

        System.out.println("string : " + string);
    }

    // 정리
    // 만드는 사람이 수고로우면 쓰는 사람이 편하고, 만드는 사람이 편하면 쓰는 사람이 수고롭다라는 말이 있다.
    // 메서드 체이닝은 구현하는 입장에서는 번거롭지만 사용하는 개발자는 편리해진다.
    //  - 사용자를 생각해서 개발하자
    // 참고로 자바의 라이브러리와 오픈 소스들은 메서드 체이닝 방식을 종종 사용한다.
}
