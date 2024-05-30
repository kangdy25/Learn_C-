package chap_11;

public class _Quiz {
    public static void main(String[] args) {
        int err = 2;

        try {
            if (err == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (err == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            } else if (err == 2) {
                throw new SoldOutSaleException("해당 상품은 매진되었습니다.");
            }

        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception {
    NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutSaleException extends Exception {
    SoldOutSaleException(String message) {
        super(message);
    }
}