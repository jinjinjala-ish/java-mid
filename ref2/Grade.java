package ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    //생성자 private, public 필요 없음
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return  discountPercent;
    }
}
