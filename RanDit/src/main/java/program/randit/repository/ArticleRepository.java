package program.randit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import program.randit.entity.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {

    Page<Article> findAll(Pageable pageable);
}
