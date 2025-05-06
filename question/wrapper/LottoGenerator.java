package question.wrapper;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random;
        }
    }

}
