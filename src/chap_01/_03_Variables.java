package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "동불";

        int hour = 20;
        System.out.println("딩동 진심을 다하는 롯데택배입니다^^");
        System.out.println(name + "님의 소중한 상품이 " + hour + "시에 도착되었습니다^^");

        double score = 90.5;
        char grade = 'A';

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("시험에 합격했을까요? " + pass);

        double d = 3.14;
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);

        long l = 1_000_000_000_000l;
        l = 1000000000000l;
        System.out.println(l);
    }
}
