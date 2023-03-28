package program.randit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import program.randit.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long>, MemberRepositoryCustom {

}
