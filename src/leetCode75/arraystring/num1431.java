package leetCode75.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num1431 {
    /**
     * 기존에 갖고있는 수 + 더 가진 수가 다른 애들보다 가장 큰 수인가?
     *
     * @param candies      기존에 갖고 있는 사탕 수
     * @param extraCandies 더 가질 수 있는 사탕 수
     * @return 제일 많은 수를 갖게되는지 t/f 반환
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int maxCandy = candies[i] + extraCandies;
            int maxDefault = Arrays.stream(candies).max().getAsInt();
            if (maxCandy >= maxDefault) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
