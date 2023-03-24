package program.randit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import program.randit.entity.Member;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
