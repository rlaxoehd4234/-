package program.randit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import program.randit.entity.dto.ArticleResponseDto;
import program.randit.entity.dto.ArticleSearchCondition;

public interface ArticleRepositoryCustom {
    Page<ArticleResponseDto> search(ArticleSearchCondition condition, Pageable pageable);
}
