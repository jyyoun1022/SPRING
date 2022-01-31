package hello.helllospring.repository;
import hello.helllospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save (Member member);    //회원을 저장소에 저장
    Optional<Member> findById(Long id); // id로 회원을 찾는다.
    Optional<Member> findByName(String name);   //이름으로 회원을 찾는다.
    List<Member> findAll(); //지금까지 저장된 모든 리스트들을 반
}
