package program.randit.repository;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;
import program.randit.entity.Member;
import program.randit.entity.QMember;
import program.randit.entity.dto.MemberResponseDto;
import program.randit.entity.dto.MemberSearchCondition;
import program.randit.entity.dto.QMemberResponseDto;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public MemberRepositoryImpl(EntityManager em){
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }


    @Override
    public Page<MemberResponseDto> search(MemberSearchCondition condition, Pageable pageable) {
        List<MemberResponseDto> content = jpaQueryFactory
                .select(new QMemberResponseDto(
                        QMember.member.name,
                        QMember.member.studentNumber,
                        QMember.member.email

                ))
                .from(QMember.member)
                .where(
                        memberNameEq(condition.getUserName()),
                        EmailEq(condition.getEmail()),
                        studentNumberEq(condition.getStudentNumber())
                )
                .fetch();

        return new PageImpl<> (content, pageable ,content.size());
    }

    private Predicate studentNumberEq(Long studentNumber) {
        return studentNumber != null ? QMember.member.studentNumber.eq(studentNumber) : null;
    }

    private BooleanExpression EmailEq(String content) {
        return StringUtils.hasText(content) ? QMember.member.email.eq(content) : null;
    }

    private BooleanExpression memberNameEq(String userName) {
        return StringUtils.hasText(userName) ? QMember.member.name.eq(userName) : null;
    }
}
