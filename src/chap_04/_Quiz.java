package chap_04;

public class _Quiz {
    public static void main(String[] args) {
        String Vehicle = "애우";
        int time = 10;
        int money = 4000;
        int total = time * money;

        if (total > 30000) {
            total = 30000;
        }
        if (Vehicle == "경차" || Vehicle == "애우") {
            total /= 2;
        }
        System.out.println(total);
    }
}
