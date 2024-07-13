package lang;

public class LangMain {
    // java.lang 패키지 소개
    // 자바가 기본으로 제공하는 라이브러리(클래스 모음) 중에 가장 기본이 되는 것이 바로 java.lang 패키지이다.
    // 여기서 lang은 Language(언어)의 줄임말이고, 쉽게 말해 자바 언어를 이루는 가장 기본이 되는 클래스들을 보관하는 패키지를 뜻한다.
    // 보통 다른 패키지에 있는 클래스를 사용하려면 import를 사용해야 하지만, 모든 자바 애플리케이션에 자동으로 import되므로 import는 생략해도 된다.

    // java.lang의 대표적인 클래스들

    // Object : 모든 자바 객체의 부모 클래스
    // String : 문자열
    // Integer, Long, Double : 래퍼 타입, 기본형 데이터 타입을 객체로 만든 것
    // Class : 클래스 메타 정보
    // System : 시스템과 관련된 기본 기능들을 제공

    // 여기 나열한 5가지 클래스들은 자바 언어의 기본을 이루기 때문에 반드시 잘 알아두어야 한다.
    public static void main(String[] args) {
        System.out.println("hello, java"); // java.lang 패키지, import java.lang.System;가 생략되어 있다.
    }
}
