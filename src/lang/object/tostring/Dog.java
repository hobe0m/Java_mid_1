package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    // ctrl + a : 메서드 혹은 생성자 자동 생성 시 전체 선택
    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    // toString() 메서드의 오버라이딩(직접 작성 X, IDE의 도움)
    // alt + insert를 통해 작성
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
