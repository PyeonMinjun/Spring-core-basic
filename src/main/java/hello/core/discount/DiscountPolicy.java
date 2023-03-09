package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액           1000원이 할이되면 1000이 할인되었다고 알려줌
     */
    int discount(Member member, int price);
}
