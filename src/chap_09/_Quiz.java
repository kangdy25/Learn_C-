package chap_09;

import java.util.ArrayList;

public class _Quiz {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("유재석", "파이썬"));
        arr.add(new Student("박명수", "자바"));
        arr.add(new Student("김종국", "자바"));
        arr.add(new Student("조세호", "C"));
        arr.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("----------------------");
        for (Student a : arr) {
            if (a.coding.equals("자바")) {
                System.out.println(a.name);
            }
        }
    }
}

class Student {
    public String name;
    public String coding;

    public Student(String name, String coding) {
        this.name = name;
        this.coding = coding;
    }
}