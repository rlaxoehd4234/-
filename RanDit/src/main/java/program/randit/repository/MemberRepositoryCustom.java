package program.randit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import program.randit.entity.dto.MemberResponseDto;
import program.randit.entity.dto.MemberSearchCondition;

public interface MemberRepositoryCustom {

    Page<MemberResponseDto> search(MemberSearchCondition condition , Pageable pageable);


}
