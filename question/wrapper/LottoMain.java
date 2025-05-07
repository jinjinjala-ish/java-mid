package question.wrapper;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] generate = lottoGenerator.generate();

        System.out.print("로또: ");
        for (int i : generate) {
            System.out.print(i + " ");
        }
    }
}
