package ref2;

public class DiscountService {

    public int discountService(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
