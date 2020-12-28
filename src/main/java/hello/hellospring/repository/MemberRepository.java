package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
  Member save(Member member);
  Optional<Member> findById(Long id);
  Optional<Member> findByName(String name);
  List<Member> findAll();
  /*
    Optional 은 자바 8에서 나온 기능이다.
    null 값에 대해서 null을 그대로 반환하는 대신 Optional을 감싸서 반환하는 방법을 선호한다.
   */
}
