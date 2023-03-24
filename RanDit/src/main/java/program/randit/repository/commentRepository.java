package program.randit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;

public interface commentRepository extends JpaRepository<Comment,Long> {
}
