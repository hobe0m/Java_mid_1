package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int width; // 필드는 건들면 안되니까, private 사용
    private int height; // 필드는 건들면 안되니까, private 사용

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }
}
