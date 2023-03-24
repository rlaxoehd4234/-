package program.randit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import program.randit.entity.Article;

public interface articleRepository extends JpaRepository<Article,Long> {
}
