package chap_06;

public class _01_Method {
    public static void sayHello() {
        System.out.println("안녕하슈 메소드임");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
