package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        Runnable cleanner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원 청소 시작 (Runnable) --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원) " + i + "번방 청소 중 (Runnable)");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- 직원 청소 끝 (Runnable) --");
            }
        };
        Runnable cleanner2 = () -> {
            System.out.println("-- 직원 청소 시작 (Runnable) --");
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("(직원) " + i + "번방 청소 중 (Runnable)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원 청소 끝 (Runnable) --");
        };
        Thread cleanerThread1 = new Thread(cleanner1);
        Thread cleanerThread2 = new Thread(cleanner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
