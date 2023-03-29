package program.randit.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import program.randit.entity.dto.ArticleResponseDto;
import program.randit.entity.dto.ArticleSearchCondition;

import javax.persistence.EntityManager;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public ArticleRepositoryImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }
    @Override
    public Page<ArticleResponseDto> search(ArticleSearchCondition condition, Pageable pageable) {
        return null;
    }
}
