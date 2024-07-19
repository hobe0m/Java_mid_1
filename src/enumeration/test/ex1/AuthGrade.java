package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");
    
    // 한번 지정되고 나면, 변하면 안되기 때문에 final 사용
    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
