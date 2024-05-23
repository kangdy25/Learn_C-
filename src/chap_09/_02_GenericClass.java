package chap_09;

import chap_09.coffee.*;
import chap_09.user.*;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("Nkunku");
        c2.ready();

        CoffeeByName c3 = new CoffeeByName("Enzo");
        c3.ready();

        CoffeeByName c4 = new CoffeeByName(10);
        c4.ready();

        System.out.println("------------------");

        String c3Name = (String)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);
        int c4Name = (int)c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

        // c4Name = (String) c3.name;

        Coffee<Integer> c5 = new Coffee<>(20);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("Palmer");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 번호 : " + c6Name);

        System.out.println("------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("Mudryk"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("Thiago Silva"));
        c8.ready();

        System.out.println("------------------");
        orderCoffee("Gallagher", "아메리카노");
        orderCoffee(25);
        orderCoffee("Caicedo", "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
