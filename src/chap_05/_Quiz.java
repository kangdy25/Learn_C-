package chap_05;

public class _Quiz {
    public static void main(String[] args) {
        int[] shoeSize = new int[10];

        for (int i  = 0; i < shoeSize.length; i++) {
            shoeSize[i] = 250 + (5 * i);
            System.out.println(shoeSize[i] + " ");
        }
        System.out.println("등이 있습니다.");
    }
}
