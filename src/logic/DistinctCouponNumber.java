package logic;

import java.util.HashSet;

public class DistinctCouponNumber {

    public void couponNumber(String[] args) {
        HashSet<Integer> couponSet = new HashSet<>();

        while(couponSet.size() != Integer.parseInt(args[0])) {
            int coupon = generateNumber(Integer.parseInt(args[0]));
            couponSet.add(coupon);
        }
        System.out.println(couponSet);
    }

    public static int generateNumber(int numberOfCoupons) {
        return (int) (Math.random() * numberOfCoupons) + 1;
    }
}
