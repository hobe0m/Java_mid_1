package immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutablaObj obj = new MutablaObj(10);
        obj.add(20);
        
        // 계산 이후 기존에 있던 값은 사라짐, 10 x 30 o
        System.out.println("obj = " + obj.getValue());
    }
}
