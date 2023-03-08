package hello.core.member;

public class MemberServiceImpl implements MemberService {

//    private final MemberRepository memberRepository ;     // 구현체가 없이 null 이라면 nullpointExcepsion

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}